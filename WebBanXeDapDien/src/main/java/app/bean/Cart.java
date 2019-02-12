package app.bean;

import java.util.Objects;

public class Cart {
    private Integer productId;
    private String productColor;
    private String productName;
    private int quantity;
    private String urlImage;
    private String productPrice;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productId=" + productId +
                ", productColor='" + productColor + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", urlImage='" + urlImage + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return productId.equals(cart.productId) &&
                productColor.equals(cart.productColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productColor);
    }
}
