package app.dao.impl;

import app.Bean.Products;
import app.dao.ProductDao;
import app.model.ImagesEntity;
import app.model.ProductDetailsEntity;
import app.model.ProductsEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.function.Consumer;

public class ProductDAOImpl extends GenericDAO<Integer, ProductsEntity> implements ProductDao {
    @Override
    public List<ProductsEntity> getProductList() {
        Session session = getSession();

        return getSession().createQuery("from ProductsEntity").getResultList();
    }

    @Override
    public List<ProductsEntity> getProductListByPage(int pageid, int total) {
        return getSession().createQuery("from ProductsEntity")
                .setFirstResult((pageid - 1) * total) // offset
                .setMaxResults(total) // limit
                .getResultList();
    }

    @Override
    public List<Products> getProductBySuppiler(String suppilerName) {
        return null;
    }

    @Override
    public int getPageCount() {
        Query query = getSession().createQuery(" Select count(*)  from ProductsEntity");
        return Integer.valueOf(String.valueOf(query.getSingleResult()));
    }

    @Override
    public ProductsEntity getProduct(Integer id) {
        ProductsEntity productsEntity = getSession().get(ProductsEntity.class, id);
        logger.info(productsEntity);
        productsEntity.getImagesEntityList().forEach(new Consumer<ImagesEntity>() {
            @Override
            public void accept(ImagesEntity imagesEntity) {
                logger.info(imagesEntity.getLink());
            }
        });
        return productsEntity;
    }


}
