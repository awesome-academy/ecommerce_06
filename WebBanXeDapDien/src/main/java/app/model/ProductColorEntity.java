package app.model;


import java.io.Serializable;
import java.util.Objects;

public class ProductColorEntity implements Serializable {
    private ProductEntity productEntity ;
    private short color;
    private int amount;

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public short getColor() {
        return color;
    }

    public void setColor(short color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductColorEntity that = (ProductColorEntity) o;
        return productEntity.equals(that.productEntity) &&
                color == that.color &&
                amount == that.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productEntity, color, amount);
    }




}
