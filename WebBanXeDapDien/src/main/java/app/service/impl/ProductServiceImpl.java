package app.service.impl;

import app.Bean.Images;
import app.Bean.ProductDetails;
import app.Bean.Products;
import app.Bean.ProductsColors;
import app.Utils.ObjectMapperUtils;
import app.model.ImagesEntity;
import app.model.ProductsColorsEntity;
import app.model.ProductsEntity;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ProductServiceImpl extends BaseServiceImpl implements ProductService {
    private static final Logger logger = Logger.getLogger(ProductServiceImpl.class);

    @Override
    public List<Products> getProductList() {
        List<Products> listProduct = ObjectMapperUtils.mapAll(productDao.getProductList(), Products.class);
        return listProduct;
    }

    @Override
    public List<Products> getProductListByPage(int pageId, int total) {
        List<Products> listProduct = ObjectMapperUtils.mapAll(productDao.getProductListByPage(pageId, total), Products.class);
        return listProduct;
    }

    @Override
    public int getPageCount() {
        return productDao.getPageCount();
    }

    @Override
    public Products getProduct(Integer id) {
        ProductsEntity productsEntity = productDao.getProduct(id);
        Products products = ObjectMapperUtils.productMap(productsEntity);
        List<Images> imagesList = ObjectMapperUtils.mapAll(productsEntity.getImagesEntityList(), Images.class);
        List<ProductsColors> productsColorsList = ObjectMapperUtils.mapAll(productsEntity.getProductsColorsEntities(), ProductsColors.class);
        products.getProductsColors().addAll(productsColorsList);
        products.getImagesList().addAll(imagesList);

        logger.info(products);

        return products;
    }


    @Override
    public ProductsEntity findById(Serializable key)
    {
        return productDao.findById(key);
    }

    @Override
    public ProductsEntity saveOrUpdate(ProductsEntity entity) {
        return productDao.saveOrUpdate(entity);
    }

    @Override
    public boolean delete(ProductsEntity entity) {

        return false;
    }
}
