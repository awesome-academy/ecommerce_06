package app.dao;



import app.model.ProductEntity;

import java.util.List;

public interface ProductDao extends BaseDAO<Integer, ProductEntity> {

    List<ProductEntity> getProductList();
    List<ProductEntity> getProductListByPage(int pageid, int total);
    List<ProductEntity> getProductBySuppiler(String suppilerName);
    int getPageCount();
    ProductEntity getProduct(Integer id);

}
