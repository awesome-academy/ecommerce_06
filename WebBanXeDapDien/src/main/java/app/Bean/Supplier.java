package app.Bean;


import java.util.*;


public class Supplier {

  private Integer id;
  private String name;
  private String adress;
  private String phoneNumber;
  private List<Product> products;
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

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  @Override
  public String toString() {
    return "Suppliers{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", adress='" + adress + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
  }
}
