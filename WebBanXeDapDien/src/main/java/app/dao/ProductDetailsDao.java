package app.dao;

import app.model.ProductDetailEntity;

public interface ProductDetailsDao extends BaseDAO<Integer, ProductDetailEntity> {

    ProductDetailEntity getProductDetailsByProductId(Integer id);

}
