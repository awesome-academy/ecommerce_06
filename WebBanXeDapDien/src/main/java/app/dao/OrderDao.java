package app.dao;

import app.model.OrderEntity;

import java.util.*;

public interface OrderDao extends BaseDAO<Integer, OrderEntity> {
    List<OrderEntity> findAll();

    int[] getRevenue();
}
