package app.model;


import java.io.Serializable;
import java.util.Objects;

public class ProductsColorsEntity implements Serializable {
    private short productId ;
    private short color;
    private int amount;
    private ProductsEntity productsByProductId;

    public short getProductId() {
        return productId;
    }

    public void setProductId(short productId) {
        this.productId = productId;
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
        ProductsColorsEntity that = (ProductsColorsEntity) o;
        return productId == that.productId &&
                color == that.color &&
                amount == that.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, color, amount);
    }

    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }


}
