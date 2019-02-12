package app.bean;
public class OrderDetail {
    private Integer orderId;
    private Integer productId;
    private short amount;
    private double price;
    private short productColor;
    private Order Order;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
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

    public app.bean.Order getOrder() {
        return Order;
    }

    public void setOrder(app.bean.Order order) {
        Order = order;
    }

    public short getProductColor() {
        return productColor;
    }

    public void setProductColor(short productColor) {
        this.productColor = productColor;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", amount=" + amount +
                ", price=" + price +
                ", productColor=" + productColor +
                ", Order=" + Order +
                '}';
    }
}
