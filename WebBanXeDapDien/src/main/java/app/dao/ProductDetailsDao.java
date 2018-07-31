package app.dao;

import app.model.ProductDetailsEntity;

public interface ProductDetailsDao extends BaseDAO<Integer, ProductDetailsEntity> {

    ProductDetailsEntity getProductDetailsByProductId(Integer id);

}
