package app.dao.impl;

import app.dao.ProductDetailsDao;
import app.model.ProductDetailEntity;

public class ProductDetailDAOImpl extends GenericDAO<Integer, ProductDetailEntity> implements ProductDetailsDao {

    @Override
    public ProductDetailEntity getProductDetailsByProductId(Integer id) {
        ProductDetailEntity detailEntity = findById(id);
        System.out.println(detailEntity);
        return findById(id);
    }

}
