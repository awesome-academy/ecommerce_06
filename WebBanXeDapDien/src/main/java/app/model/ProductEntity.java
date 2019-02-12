package app.model;
import java.io.Serializable;
import java.util.*;
public class ProductEntity implements Serializable {
    private Integer id;
    private String name;
    private double price;
    private String mainPhoto;
    private SupplierEntity SupplierEntity;
    private List<ImageEntity> imageEntities;
    private List<ProductColorEntity> productColorEntities;
    private List<OrderDetailEntity> orderDetailEntities;

    public ProductEntity() {
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

    public app.model.SupplierEntity getSupplierEntity() {
        return SupplierEntity;
    }

    public void setSupplierEntity(app.model.SupplierEntity supplierEntity) {
        SupplierEntity = supplierEntity;
    }

    public List<ImageEntity> getImageEntities() {
        return imageEntities;
    }

    public void setImageEntities(List<ImageEntity> imageEntities) {
        this.imageEntities = imageEntities;
    }

    public List<ProductColorEntity> getProductColorEntities() {
        return productColorEntities;
    }

    public void setProductColorEntities(List<ProductColorEntity> productColorEntities) {
        this.productColorEntities = productColorEntities;
    }

    public List<OrderDetailEntity> getOrderDetailEntities() {
        return orderDetailEntities;
    }

    public void setOrderDetailEntities(List<OrderDetailEntity> orderDetailEntities) {
        this.orderDetailEntities = orderDetailEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id == that.id &&
                price == that.price &&
                Objects.equals(name, that.name) &&
                Objects.equals(mainPhoto, that.mainPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, mainPhoto);
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mainPhoto='" + mainPhoto + '\'' +
                ", suppliersEntity=" + SupplierEntity +
                '}';
    }
}
