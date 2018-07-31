package app.model;

import java.io.Serializable;
import java.util.*;

public class ProductEntity implements Serializable {
    private Integer id;
    private String name;
    private double price;
    private String mainPhoto;
    private SupplierEntity SupplierEntity;
    private List<ImageEntity> imagesEntities;
    private List<ProductColorEntity> productsColorsEntities;
    private List<OrderDetailEntity> ordersDetailsEntities;

    public ProductEntity() {
    }

    public List<ImageEntity> getImagesEntities() {
        return imagesEntities;
    }

    public void setImagesEntities(List<ImageEntity> imagesEntities) {
        this.imagesEntities = imagesEntities;
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


    public List<ProductColorEntity> getProductsColorsEntities() {
        return productsColorsEntities;
    }

    public void setProductsColorsEntities(List<ProductColorEntity> productsColorsEntities) {
        this.productsColorsEntities = productsColorsEntities;
    }

    public List<OrderDetailEntity> getOrdersDetailsEntities() {
        return ordersDetailsEntities;
    }

    public void setOrdersDetailsEntities(List<OrderDetailEntity> ordersDetailsEntities) {
        this.ordersDetailsEntities = ordersDetailsEntities;
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
