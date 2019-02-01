package app.Bean;


public class ProductColor {

  private Integer productId ;
  private short color;
  private int amount;
  private Product product;

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

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
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
