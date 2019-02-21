package app.model;
import java.io.Serializable;
import java.util.Objects;
import java.util.*;
public class SupplierEntity implements Serializable {
    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    private List<ProductEntity> productEntities;

    public SupplierEntity() {
    }

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplierEntity)) return false;
        SupplierEntity that = (SupplierEntity) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getAddress(), that.getAddress()) &&
                Objects.equals(getPhoneNumber(), that.getPhoneNumber()) &&
                Objects.equals(getProductEntities(), that.getProductEntities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getPhoneNumber(), getProductEntities());
    }

    @Override
    public String toString() {
        return "SupplierEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
