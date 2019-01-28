package app.service.impl;


import app.dao.ProductDao;

public class BaseServiceImpl {
	protected ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
