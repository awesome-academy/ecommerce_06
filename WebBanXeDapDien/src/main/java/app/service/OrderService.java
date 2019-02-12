package app.service;

import app.bean.Order;
import app.model.OrderEntity;

public interface OrderService extends BaseService<Integer, OrderEntity> {

    OrderEntity save(Order order);

}
