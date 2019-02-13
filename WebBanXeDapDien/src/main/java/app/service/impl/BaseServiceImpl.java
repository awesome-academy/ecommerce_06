package app.service.impl;


import app.dao.ProductDao;
import app.dao.ProductDetailsDao;

public class BaseServiceImpl {
	protected ProductDao productDao;

	protected ProductDetailsDao productDetailsDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

    public ProductDetailsDao getProductDetailsDao() {
        return productDetailsDao;
    }

    public void setProductDetailsDao(ProductDetailsDao productDetailsDao) {
        this.productDetailsDao = productDetailsDao;
    }
}
