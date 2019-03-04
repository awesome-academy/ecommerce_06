package app.service;

import app.bean.Order;
import app.model.OrderEntity;

import java.util.*;

public interface OrderService extends BaseService<Integer, OrderEntity> {

    OrderEntity save(Order order);

    List<Order> findAll();

    Order findOrderById(Integer id);

    boolean update(Order order);

    int[] getRevenue();

}
