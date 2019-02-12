package app.service.impl;

import app.Utils.ObjectMapperUtils;
import app.bean.Order;
import app.model.OrderDetailEntity;
import app.model.OrderEntity;
import app.service.OrderService;
import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import java.io.Serializable;
import java.util.List;

public class OrderServiceImpl extends BaseServiceImpl implements OrderService {
    private static final Logger logger = Logger.getLogger(OrderServiceImpl.class);

    @Override
    public OrderEntity findById(Serializable key) {
        try {
            return orderDao.findById(key);
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public OrderEntity saveOrUpdate(OrderEntity entity) {
        try {
            return orderDao.saveOrUpdate(entity);
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }

    }

    @Override
    public boolean delete(OrderEntity entity) {
        try {
            OrderEntity orderDaoByIdUsingLock = orderDao.findByIdUsingLock(entity.getId(), LockMode.PESSIMISTIC_WRITE);
            if (orderDaoByIdUsingLock == null) {
                return false;
            } else {
                orderDao.delete(entity);
                return true;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }

    }

    @Override
    public OrderEntity save(Order order) {
        try {
            OrderEntity orderEntity = ObjectMapperUtils.orderEntityMap(order);
            OrderEntity orderEntity2 = orderDao.saveOrUpdate(orderEntity);
            List<OrderDetailEntity> orderDetailEntities = ObjectMapperUtils.orderDetailsEntityMap(order.getOrderDetails());
            for (int i = 0; i < orderDetailEntities.size(); i++) {
                orderDetailEntities.get(i).getOrderDetailEntityPK().setOrderEntity(orderEntity2);
                logger.info(orderDetailEntities.get(i));
                orderDetailDao.saveOrUpdate(orderDetailEntities.get(i));
            }
            return orderEntity;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }
}
