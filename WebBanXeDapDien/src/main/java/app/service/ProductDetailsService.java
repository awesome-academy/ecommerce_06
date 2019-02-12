package app.service;
import app.bean.ProductDetail;
import app.model.ProductDetailEntity;
public interface ProductDetailsService extends BaseService<Integer, ProductDetailEntity> {

    ProductDetail getProductDetailbyProductId(Integer id);

}
