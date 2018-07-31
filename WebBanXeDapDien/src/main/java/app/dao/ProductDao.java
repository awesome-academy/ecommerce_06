package app.dao;


import app.Bean.ProductDetails;
import app.Bean.Products;
import app.model.ProductDetailsEntity;
import app.model.ProductsEntity;

import java.util.List;

public interface ProductDao extends BaseDAO<Integer, ProductsEntity> {

    List<ProductsEntity> getProductList();
    List<ProductsEntity> getProductListByPage(int pageid, int total);
    List<Products> getProductBySuppiler(String suppilerName);
    int getPageCount();
    ProductsEntity getProduct(Integer id);

}
