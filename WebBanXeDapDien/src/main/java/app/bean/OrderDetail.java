package app.bean;
public class OrderDetail {
    private Order order;
    private Product product;
    private short amount;
    private double price;
    private Color productColor;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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


    public Color getProductColor() {
        return productColor;
    }

    public void setProductColor(Color productColor) {
        this.productColor = productColor;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "order=" + order +
                ", product=" + product +
                ", amount=" + amount +
                ", price=" + price +
                ", productColor=" + productColor +
                '}';
    }
}
