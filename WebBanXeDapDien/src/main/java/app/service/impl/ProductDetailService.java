package app.service.impl;

import app.Bean.ProductDetails;
import app.Utils.ObjectMapperUtils;
import app.model.ProductDetailsEntity;
import app.service.ProductDetailsService;

import java.io.Serializable;

public class ProductDetailService extends BaseServiceImpl implements ProductDetailsService {

    @Override
    public ProductDetails getProductDetailbyProductId(Integer id) {

        ProductDetails productDetails = ObjectMapperUtils.map(productDetailsDao.getProductDetailsByProductId(id), ProductDetails.class);
        return productDetails;
    }

    @Override
    public ProductDetailsEntity findById(Serializable key) {
        return null;
    }

    @Override
    public ProductDetailsEntity saveOrUpdate(ProductDetailsEntity entity) {
        return null;
    }

    @Override
    public boolean delete(ProductDetailsEntity entity) {
        return false;
    }
}
