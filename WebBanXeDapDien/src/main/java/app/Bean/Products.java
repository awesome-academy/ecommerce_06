package app.Bean;


import java.util.HashSet;
import java.util.Set;

public class Products {

  private Integer id;
  private String name;
  private double price;
  private String mainPhoto;
  private Suppliers supplier;
  private Set<Images> imagesList = new HashSet<>(0);
  private Set<ProductsColors> productsColors = new HashSet<>(0);
  private Set<OrdersDetails> ordersDetails = new HashSet<>(0);

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

  public Suppliers getSupplier() {
    return supplier;
  }

  public void setSupplier(Suppliers supplier) {
    this.supplier = supplier;
  }

  public Set<Images> getImagesList() {
    return imagesList;
  }

  public void setImagesList(Set<Images> imagesList) {
    this.imagesList = imagesList;
  }

  public Set<ProductsColors> getProductsColors() {
    return productsColors;
  }

  public void setProductsColors(Set<ProductsColors> productsColors) {
    this.productsColors = productsColors;
  }

  public Set<OrdersDetails> getOrdersDetails() {
    return ordersDetails;
  }

  public void setOrdersDetails(Set<OrdersDetails> ordersDetails) {
    this.ordersDetails = ordersDetails;
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
