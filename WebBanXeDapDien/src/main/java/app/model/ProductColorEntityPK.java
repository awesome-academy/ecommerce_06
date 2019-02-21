package app.model;
import java.io.Serializable;
import java.util.Objects;
public class ProductColorEntityPK implements Serializable {
    private Integer productId;
    private Integer color;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductColorEntityPK that = (ProductColorEntityPK) o;
        return productId == that.productId &&
                color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, color);
    }
}
