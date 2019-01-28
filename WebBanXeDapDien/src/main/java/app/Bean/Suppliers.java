package app.Bean;


import java.util.HashSet;
import java.util.Set;

public class Suppliers {

  private Integer id;
  private String name;
  private String adress;
  private String phoneNumber;
  private Set<Products> productsEntities = new HashSet<>(0);

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

  public Set<Products> getProductsEntities() {
    return productsEntities;
  }

  public void setProductsEntities(Set<Products> productsEntities) {
    this.productsEntities = productsEntities;
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
