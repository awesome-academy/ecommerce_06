package app.dao.impl;

import app.dao.ProductDetailsDao;
import app.model.ProductDetailsEntity;

public class ProductDetailDAOIml extends GenericDAO<Integer, ProductDetailsEntity> implements ProductDetailsDao {
    @Override
    public ProductDetailsEntity getProductDetailsByProductId(Integer id) {

        ProductDetailsEntity detailsEntity = (ProductDetailsEntity) getSession().createQuery("From ProductDetailsEntity p WHERE p.productsEntity.id = :id").setParameter("id", id).getSingleResult();
        return detailsEntity;
    }
}
