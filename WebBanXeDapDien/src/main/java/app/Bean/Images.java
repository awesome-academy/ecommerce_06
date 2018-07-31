package app.Bean;


public class Images {

  private String link;
  private Integer id;
  private Products products;

  public Products getProducts() {
    return products;
  }

  public void setProducts(Products products) {
    this.products = products;
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
            ", products=" + products +
            '}';
  }
}
