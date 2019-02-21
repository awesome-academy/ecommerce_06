package app.model;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetailEntity implements Serializable {
    private OrderDetailEntityPK orderDetailEntityPK;
    private short amount;
    private double price;

    public OrderDetailEntityPK getOrderDetailEntityPK() {
        return orderDetailEntityPK;
    }

    public void setOrderDetailEntityPK(OrderDetailEntityPK orderDetailEntityPK) {
        this.orderDetailEntityPK = orderDetailEntityPK;
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
        return amount == that.amount &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(orderDetailEntityPK, that.orderDetailEntityPK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDetailEntityPK, amount, price);
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" +
                "orderDetailEntityPK=" + orderDetailEntityPK +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
