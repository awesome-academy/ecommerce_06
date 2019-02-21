package app.dao.impl;

import app.dao.ProductDetailsDao;
import app.model.ProductDetailEntity;

public class ProductDetailDAOImpl extends GenericDAO<Integer, ProductDetailEntity> implements ProductDetailsDao {

    @Override
    public ProductDetailEntity getProductDetailsByProductId(Integer id) {
        return (ProductDetailEntity) getSession().createQuery("From ProductDetailEntity P Where P.productEntity.id = :id").setParameter("id",id).getSingleResult();
    }

}
