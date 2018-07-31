package app.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SuppliersEntity {
    private Integer id;
    private String name;
    private String adress;
    private String phoneNumber;
    private Set<ProductsEntity> productsEntities = new HashSet<>(0);

    public Set<ProductsEntity> getProductsEntities() {
        return productsEntities;
    }

    public void setProductsEntities(Set<ProductsEntity> productsEntities) {
        this.productsEntities = productsEntities;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuppliersEntity that = (SuppliersEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(adress, that.adress) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, adress, phoneNumber);
    }

    @Override
    public String toString() {
        return "SuppliersEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
