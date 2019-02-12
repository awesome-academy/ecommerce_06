package app.service;
import app.bean.Product;
import app.model.ProductEntity;
import java.util.List;
public interface ProductService extends BaseService<Integer, ProductEntity> {

    List<Product> getProductList();

    List<Product> getProductListByPage(int pageId, int total);

    int getPageCount();

    Product getProduct(Integer id);

    List<Product> getProductByNameAndSuppilerId(String name, int supplierId);

}
