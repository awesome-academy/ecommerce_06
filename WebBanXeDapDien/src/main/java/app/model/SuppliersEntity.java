package app.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "suppliers", schema = "QuanLyXeDien", catalog = "")
public class SuppliersEntity {
    private short id;
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

    @Id
    @Column(name = "Id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "adress", nullable = false, length = 50)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "PhoneNumber", nullable = true, length = 15)
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
}
