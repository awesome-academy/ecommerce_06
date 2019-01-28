package app.dao.impl;

import app.Bean.Products;
import app.dao.ProductDao;
import app.model.ProductsEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDAOImpl extends GenericDAO<Integer, ProductsEntity> implements ProductDao {
    @Override
    public List<ProductsEntity> getProductList() {
        Session session = getSession();

        return getSession().createQuery("from ProductsEntity").getResultList();
    }

    @Override
    public List<ProductsEntity> getProductListByPage(int pageid, int total) {
        return getSession().createQuery("from ProductsEntity")
                .setFirstResult((pageid-1)*total) // offset
                .setMaxResults(total) // limit
                .getResultList();
    }

    @Override
    public List<Products> getProductBySuppiler(String suppilerName) {
        return null;
    }

    @Override
    public long getPageCount() {
        Query query = getSession().createQuery("select count(*) from ProductsEntity");
        return (long) query.uniqueResult();
    }
}
