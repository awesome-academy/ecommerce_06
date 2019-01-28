package app.service;

import app.Bean.Products;
import app.model.ProductsEntity;

import java.util.List;

public interface ProductService extends BaseService<Integer, ProductsEntity> {
    List<Products> getProductList();
    List<Products> getProductListByPage(int pageId, int total);
    long getPageCount();
}
