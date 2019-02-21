package app.service.impl;

import app.dao.*;
import org.springframework.mail.MailSender;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BaseServiceImpl {
    protected ProductDao productDao;
    protected ProductDetailsDao productDetailsDao;
    protected OrderDao orderDao;
    protected OrderDetailDao orderDetailDao;
    protected SuppilerDao suppilerDao;
    protected AccountDao accountDao;
    protected MailSender mailSender;
    protected PasswordEncoder passwordEncoder;

    public PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public MailSender getMailSender() {
        return mailSender;
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

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
