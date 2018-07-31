package app.Bean;


import app.model.OrdersEntity;

public class OrdersDetails {
  private Integer orderId;
  private short productId;
  private short amount;
  private double price;
  private Orders ordersByOrderId;

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

  public Orders getOrdersByOrderId() {
    return ordersByOrderId;
  }

  public void setOrdersByOrderId(Orders ordersByOrderId) {
    this.ordersByOrderId = ordersByOrderId;
  }
}
