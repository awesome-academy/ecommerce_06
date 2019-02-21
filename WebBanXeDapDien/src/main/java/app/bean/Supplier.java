package app.bean;
import java.util.*;
public class Supplier {
  private Integer id;
  private String name;
  private String address;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
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
            ", adress='" + address + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
  }
}
