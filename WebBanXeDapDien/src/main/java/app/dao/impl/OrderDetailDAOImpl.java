package app.dao.impl;

import app.dao.OrderDetailDao;
import app.dao.ProductDao;
import app.model.OrderDetailEntity;
import app.model.OrderDetailEntityPK;
import app.model.OrderEntity;
import app.model.ProductEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class OrderDetailDAOImpl extends GenericDAO<OrderDetailEntityPK, OrderDetailEntity> implements OrderDetailDao {
    @Override
    public List<OrderDetailEntity> findByOrderId(Integer id) {
        return getSession().createQuery("from OrderDetailEntity  OD Where OD.orderDetailEntityPK.orderEntity.id = :orderId").setParameter("orderId", id).getResultList();
    }

    @Override
    public OrderDetailEntity loadById(OrderDetailEntityPK orderDetailEntityPK) {
        return getSession().get(OrderDetailEntity.class,orderDetailEntityPK);
    }
}
