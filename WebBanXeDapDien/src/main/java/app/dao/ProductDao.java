package app.dao;


import app.Bean.Products;
import app.model.ProductsEntity;

import java.util.List;

public interface ProductDao extends BaseDAO<Long, ProductsEntity> {

    List<ProductsEntity> getProductList();
    List<ProductsEntity> getProductListByPage(int pageid, int total);
    List<Products> getProductBySuppiler(String suppilerName);
    long getPageCount();
    
}
