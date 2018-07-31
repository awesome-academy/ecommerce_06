package app.service;

import app.Bean.ProductDetails;
import app.model.ProductDetailsEntity;

public interface ProductDetailsService extends BaseService<Integer, ProductDetailsEntity> {

    ProductDetails getProductDetailbyProductId(Integer id);
}
