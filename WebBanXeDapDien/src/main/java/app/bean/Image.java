package app.bean;
public class Image {
  private String link;
  private Integer id;
  private Product product;

  public Product getProducts() {
    return product;
  }

  public void setProducts(Product products) {
    this.product = products;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Images{" +
            "link='" + link + '\'' +
            ", id=" + id +
            ", products=" + product +
            '}';
  }
}
