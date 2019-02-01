package app.Bean;


public class OrderDetail {
    private Integer orderId;
    private short productId;
    private short amount;
    private double price;
    private Order Order;

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

    public app.Bean.Order getOrder() {
        return Order;
    }

    public void setOrder(app.Bean.Order order) {
        Order = order;
    }
}
