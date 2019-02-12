package app.service.impl;

import app.dao.*;

public class BaseServiceImpl {
	protected ProductDao productDao;
	protected ProductDetailsDao productDetailsDao;
	protected OrderDao orderDao;
	protected OrderDetailDao orderDetailDao;
	protected SuppilerDao suppilerDao;

	public SuppilerDao getSuppilerDao() {
		return suppilerDao;
	}

	public void setSuppilerDao(SuppilerDao suppilerDao) {
		this.suppilerDao = suppilerDao;
	}

	public OrderDetailDao getOrderDetailDao() {
		return orderDetailDao;
	}

	public void setOrderDetailDao(OrderDetailDao orderDetailDao) {
		this.orderDetailDao = orderDetailDao;
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

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
