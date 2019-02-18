package app.model;
import java.io.Serializable;
import java.util.Objects;
public class OrderDetailEntityPK implements Serializable {
    private OrderEntity orderEntity;
    private ProductEntity productEntity;
    private Short color;


    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public Short getColor() {
        return color;
    }

    public void setColor(Short color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "OrderDetailEntityPK{" +
                "orderEntity=" + orderEntity +
                ", productEntity=" + productEntity +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetailEntityPK)) return false;
        OrderDetailEntityPK that = (OrderDetailEntityPK) o;
        return Objects.equals(getOrderEntity(), that.getOrderEntity()) &&
                Objects.equals(getProductEntity(), that.getProductEntity()) &&
                Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderEntity(), getProductEntity(), getColor());
    }
}
