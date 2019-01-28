package app.model;

import java.util.*;

public class ProductsEntity {
    private Integer id;
    private String name;
    private double price;
    private String mainPhoto;
    private SuppliersEntity suppliersEntity;
    private Set<ImagesEntity> imagesEntityList = new HashSet<>(0);
    private Set<ProductsColorsEntity> productsColorsEntities = new HashSet<>(0);
    private Set<OrdersDetailsEntity> ordersDetailsEntities = new HashSet<>(0);

    public Set<OrdersDetailsEntity> getOrdersDetailsEntities() {
        return ordersDetailsEntities;
    }

    public void setOrdersDetailsEntities(Set<OrdersDetailsEntity> ordersDetailsEntities) {
        this.ordersDetailsEntities = ordersDetailsEntities;
    }

    public Set<ProductsColorsEntity> getProductsColorsEntities() {
        return productsColorsEntities;
    }

    public void setProductsColorsEntities(Set<ProductsColorsEntity> productsColorsEntities) {
        this.productsColorsEntities = productsColorsEntities;
    }

    public Set<ImagesEntity> getImagesEntityList() {
        return imagesEntityList;
    }

    public void setImagesEntityList(Set<ImagesEntity> imagesEntityList) {
        this.imagesEntityList = imagesEntityList;
    }

    public SuppliersEntity getSuppliersEntity() {
        return suppliersEntity;
    }

    public void setSuppliersEntity(SuppliersEntity suppliersEntity) {
        this.suppliersEntity = suppliersEntity;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return id == that.id &&
                price == that.price &&
                Objects.equals(name, that.name) &&
                Objects.equals(mainPhoto, that.mainPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, mainPhoto);
    }
}
