package app.service.impl;

import app.bean.ProductDetail;
import app.Utils.ObjectMapperUtils;
import app.model.ProductDetailEntity;
import app.service.ProductDetailsService;
import org.apache.log4j.Logger;

import java.io.Serializable;

public class ProductDetailService extends BaseServiceImpl implements ProductDetailsService {

    private static final Logger logger = Logger.getLogger(ProductDetailService.class);

    @Override
    public ProductDetail getProductDetailbyProductId(Integer id) {

        try {
            return ObjectMapperUtils.map(productDetailsDao.getProductDetailsByProductId(id), ProductDetail.class);
        } catch (Exception e) {
            logger.info(e.getMessage());
            return null;
        }
    }

    @Override
    public ProductDetailEntity findById(Serializable key) {
        try {
            return productDetailsDao.findById(key);
        }catch (Exception e){

            logger.info(e);
            return null;
        }
    }

    @Override
    public ProductDetailEntity saveOrUpdate(ProductDetailEntity entity) {
        try {

            return productDetailsDao.saveOrUpdate(entity);

        }catch (Exception e){

            logger.info(e.getMessage());

            throw e;
        }
    }

    @Override
    public boolean delete(ProductDetailEntity entity) {
        try {

            productDetailsDao.delete(entity);

            return true;
        }catch (Exception e){

            logger.info(e);

            throw e;
        }
    }
}
