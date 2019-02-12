package app.dao.impl;

import app.dao.ProductDetailsDao;
import app.model.ProductDetailEntity;

public class ProductDetailDAOIml extends GenericDAO<Integer, ProductDetailEntity> implements ProductDetailsDao {
    @Override
    public ProductDetailEntity getProductDetailsByProductId(Integer id) {

        ProductDetailEntity detailsEntity = (ProductDetailEntity) getSession().createQuery("From ProductDetailEntity p WHERE p.productEntity.id = :id").setParameter("id", id).getSingleResult();
        return detailsEntity;
    }
}
