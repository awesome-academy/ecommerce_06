package app.model;


import java.io.Serializable;
import java.util.Objects;

public class ProductsColorsEntity implements Serializable {
    private ProductsEntity Product_Id ;
    private short color;
    private int amount;

    public ProductsEntity getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(ProductsEntity product_Id) {
        Product_Id = product_Id;
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
        return Product_Id.equals(that.Product_Id) &&
                color == that.color &&
                amount == that.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Product_Id, color, amount);
    }




}
