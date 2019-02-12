package app.service.impl;

import app.bean.Product;
import app.bean.ProductColor;
import app.Utils.ObjectMapperUtils;
import app.model.ProductEntity;
import app.service.ProductService;
import org.apache.log4j.Logger;
import java.io.Serializable;
import java.util.List;
import java.util.function.Consumer;

public class ProductServiceImpl extends BaseServiceImpl implements ProductService {
    private static final Logger logger = Logger.getLogger(ProductServiceImpl.class);

    @Override
    public List<Product> getProductList() {

        try {

            return ObjectMapperUtils.mapAll(productDao.getProductList(), Product.class);

        } catch (Exception e) {

            logger.info(e.getMessage());
            return null;
        }

    }

    @Override
    public List<Product> getProductListByPage(int pageId, int total) {

        try {
            return ObjectMapperUtils.mapAll(productDao.getProductListByPage(pageId, total), Product.class);
        } catch (Exception e) {

            logger.info(e.getMessage());
            return null;
        }


    }

    @Override
    public int getPageCount() {
        try {

            return productDao.getPageCount();
        } catch (Exception e) {

            logger.info(e.getMessage());
            return 0;
        }

    }

    @Override
    public Product getProduct(Integer id) {

        try {

            ProductEntity ProductEntity = productDao.getProduct(id);

            Product Product = ObjectMapperUtils.productMap(ProductEntity);

            return Product;
        } catch (Exception e) {

            logger.info(e);
            return null;
        }

    }


    @Override
    public ProductEntity findById(Serializable key) {
        try {

            return productDao.findById(key);
        } catch (Exception e) {

            logger.info(e.getMessage());
            return null;
        }
    }

    @Override
    public ProductEntity saveOrUpdate(ProductEntity entity) {
        try {

            return productDao.saveOrUpdate(entity);
        } catch (Exception e) {
            logger.info(e.getMessage());
            throw e;
        }
    }

    @Override
    public boolean delete(ProductEntity entity) {
        try {

            productDao.delete(entity);
            return true;
        } catch (Exception e) {

            logger.info(e.getMessage());

            throw e;
        }
    }
}
