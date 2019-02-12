package app.bean;
import java.util.*;
public class Product {
  private Integer id;
  private String name;
  private double price;
  private String mainPhoto;
  private Supplier supplier;
  private List<Image> images;
  private List<ProductColor> productColors;
  private List<OrderDetail> orderDetails ;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getMainPhoto() {
    return mainPhoto;
  }

  public void setMainPhoto(String mainPhoto) {
    this.mainPhoto = mainPhoto;
  }


  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }

  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public List<ProductColor> getProductColors() {
    return productColors;
  }

  public void setProductColors(List<ProductColor> productColors) {
    this.productColors = productColors;
  }

  public List<OrderDetail> getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(List<OrderDetail> orderDetails) {
    this.orderDetails = orderDetails;
  }

  @Override
  public String toString() {
    return "Products{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", mainPhoto='" + mainPhoto + '\'' +
            ", supplier=" + supplier +
            '}';
  }
}
