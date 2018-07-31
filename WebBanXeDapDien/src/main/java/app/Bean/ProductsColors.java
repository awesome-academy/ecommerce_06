package app.Bean;


public class ProductsColors {

  private Integer productId ;
  private short color;
  private int amount;
  private Products productsByProductId;

  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
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

  public Products getProductsByProductId() {
    return productsByProductId;
  }

  public void setProductsByProductId(Products productsByProductId) {
    this.productsByProductId = productsByProductId;
  }

  @Override
  public String toString() {
    return "ProductsColors{" +
            "productId=" + productId +
            ", color=" + color +
            ", amount=" + amount +
            '}';
  }
}
