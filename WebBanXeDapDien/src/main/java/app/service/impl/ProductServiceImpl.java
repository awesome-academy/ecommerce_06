package app.service.impl;

import app.Bean.Products;
import app.Utils.ObjectMapperUtils;
import app.model.ProductsEntity;
import app.service.ProductService;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.List;
import java.util.function.Consumer;

public class ProductServiceImpl extends BaseServiceImpl implements ProductService {
	private static final Logger logger = Logger.getLogger(ProductServiceImpl.class);

	@Override
	public List<Products> getProductList() {
		List<Products> listProduct = ObjectMapperUtils.mapAll(productDao.getProductList(),Products.class);
		return listProduct;
	}

	@Override
	public List<Products> getProductListByPage(int pageId, int total) {
		List<Products> listProduct = ObjectMapperUtils.mapAll(productDao.getProductListByPage(pageId,total),Products.class);
		return listProduct;
	}

	@Override
	public long  getPageCount() {
		return productDao.getPageCount();
	}

	@Override
	public ProductsEntity findById(Serializable key) {
		return null;
	}

	@Override
	public ProductsEntity saveOrUpdate(ProductsEntity entity) {
		return null;
	}

	@Override
	public boolean delete(ProductsEntity entity) {
		return false;
	}
}
