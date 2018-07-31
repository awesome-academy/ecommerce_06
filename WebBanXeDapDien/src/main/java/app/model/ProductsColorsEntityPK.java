package app.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProductsColorsEntityPK implements Serializable {
    private short productId;
    private short color;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsColorsEntityPK that = (ProductsColorsEntityPK) o;
        return productId == that.productId &&
                color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, color);
    }
}
