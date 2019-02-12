package app.dao;

import app.model.ProductEntity;
import java.util.List;

public interface ProductDao extends BaseDAO<Integer, ProductEntity> {
    List<ProductEntity> getProductList();
    List<ProductEntity> getProductListByPage(int pageid, int total);
    List<ProductEntity> getProductByNameAndSuppilerId(String name, int supplierId);
    int getPageCount();
    ProductEntity getProduct(Integer id);
}
