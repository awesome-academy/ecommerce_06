package app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class OrderDetailEntity implements Serializable {
    private Integer orderId;
    private short productId;
    private short amount;
    private double price;
    private OrderEntity orderEntity;
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public short getProductId() {
        return productId;
    }

    public void setProductId(short productId) {
        this.productId = productId;
    }

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailEntity that = (OrderDetailEntity) o;
        return orderId.equals(that.orderId) &&
                productId == that.productId &&
                amount == that.amount &&
                price == that.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId, amount, price);
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }
}
