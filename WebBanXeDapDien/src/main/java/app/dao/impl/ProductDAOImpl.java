package app.dao.impl;

import app.dao.ProductDao;
import app.model.ImageEntity;
import app.model.ProductEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class ProductDAOImpl extends GenericDAO<Integer, ProductEntity> implements ProductDao {
    @Override
    public List<ProductEntity> getProductList() {
        Session session = getSession();

        return getSession().createQuery("from ProductsEntity").getResultList();
    }

    @Override
    public List<ProductEntity> getProductListByPage(int pageid, int total) {
        return getSession().createQuery("from ProductEntity")
                .setFirstResult((pageid - 1) * total) // offset
                .setMaxResults(total) // limit
                .getResultList();
    }

    @Override
    public List<ProductEntity> getProductBySuppiler(String suppilerName) {
        return null;
    }

    @Override
    public int getPageCount() {
        Query query = getSession().createQuery(" Select count(*)  from ProductEntity");
        return Integer.valueOf(String.valueOf(query.getSingleResult()));
    }

    @Override
    public ProductEntity getProduct(Integer id) {

        ProductEntity productsEntity =findById(id);

        productsEntity.getImageEntities().removeIf(Objects::isNull);

        productsEntity.getProductColorEntities().removeIf(Objects::isNull);

        productsEntity.getOrderDetailEntities().removeIf(Objects::isNull);

        return productsEntity;

    }


}
