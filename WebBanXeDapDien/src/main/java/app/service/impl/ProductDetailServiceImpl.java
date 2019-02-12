package app.service.impl;

import app.bean.ProductDetail;
import app.Utils.ObjectMapperUtils;
import app.model.ProductDetailEntity;
import app.service.ProductDetailsService;
import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import java.io.Serializable;

public class ProductDetailServiceImpl extends BaseServiceImpl implements ProductDetailsService {

    private static final Logger logger = Logger.getLogger(ProductDetailServiceImpl.class);

    @Override
    public ProductDetail getProductDetailbyProductId(Integer id) {
        try {
            return ObjectMapperUtils.map(productDetailsDao.findById(id), ProductDetail.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public ProductDetailEntity findById(Serializable key) {
        try {
            return productDetailsDao.findById(key);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    @Override
    public ProductDetailEntity saveOrUpdate(ProductDetailEntity entity) {
        try {
            return productDetailsDao.saveOrUpdate(entity);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public boolean delete(ProductDetailEntity entity) {
        try {
            ProductDetailEntity detailEntity = productDetailsDao.findByIdUsingLock(entity.getId(), LockMode.PESSIMISTIC_WRITE);
            if (detailEntity == null)
                return false;
            else {
                productDetailsDao.delete(detailEntity);
                return true;
            }
        } catch (Exception e) {
            logger.error(e);
            throw e;
        }
    }
}
