package app.Bean;


import java.util.HashSet;
import java.util.Set;

public class Products {

  private Integer id;
  private String name;
  private double price;
  private String mainPhoto;
  private Suppliers suppliersEntity;
  private Set<Images> imagesEntityList = new HashSet<>(0);
  private Set<ProductsColors> productsColorsEntities = new HashSet<>(0);
  private Set<OrdersDetails> ordersDetailsEntities = new HashSet<>(0);

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

  public Suppliers getSuppliersEntity() {
    return suppliersEntity;
  }

  public void setSuppliersEntity(Suppliers suppliersEntity) {
    this.suppliersEntity = suppliersEntity;
  }

  public Set<Images> getImagesEntityList() {
    return imagesEntityList;
  }

  public void setImagesEntityList(Set<Images> imagesEntityList) {
    this.imagesEntityList = imagesEntityList;
  }

  public Set<ProductsColors> getProductsColorsEntities() {
    return productsColorsEntities;
  }

  public void setProductsColorsEntities(Set<ProductsColors> productsColorsEntities) {
    this.productsColorsEntities = productsColorsEntities;
  }

  public Set<OrdersDetails> getOrdersDetailsEntities() {
    return ordersDetailsEntities;
  }

  public void setOrdersDetailsEntities(Set<OrdersDetails> ordersDetailsEntities) {
    this.ordersDetailsEntities = ordersDetailsEntities;
  }

  @Override
  public String toString() {
    return "Products{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", mainPhoto='" + mainPhoto + '\'' +
            ", suppliersEntity=" + suppliersEntity +
            '}';
  }
}
