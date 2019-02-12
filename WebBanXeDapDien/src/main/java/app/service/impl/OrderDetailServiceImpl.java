package app.service.impl;

import app.model.OrderDetailEntity;
import app.service.OrderDetailService;
import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import java.io.Serializable;

public class OrderDetailServiceImpl extends BaseServiceImpl implements OrderDetailService {
    private static final Logger logger = Logger.getLogger(OrderDetailServiceImpl.class);

    @Override
    public OrderDetailEntity findById(Serializable key) {
        try {
            return orderDetailDao.findById(key);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public OrderDetailEntity saveOrUpdate(OrderDetailEntity entity) {
        try {
            return orderDetailDao.saveOrUpdate(entity);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public boolean delete(OrderDetailEntity entity) {
        try {
            OrderDetailEntity OrderDetailEntity = orderDetailDao.findByIdUsingLock(entity.getOrderDetailEntityPK(), LockMode.PESSIMISTIC_WRITE);
            if (OrderDetailEntity == null) {
                return false;
            } else {
                orderDetailDao.delete(entity);
                return true;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }
}
