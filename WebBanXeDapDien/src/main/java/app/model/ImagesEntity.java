package app.model;


import java.util.Objects;

public class ImagesEntity {
    private String link;
    private Integer id;
    private ProductsEntity productsEntity;

    public ProductsEntity getProductsEntity() {
        return productsEntity;
    }

    public void setProductsEntity(ProductsEntity productsEntity) {
        this.productsEntity = productsEntity;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImagesEntity that = (ImagesEntity) o;
        return id == that.id &&
                Objects.equals(link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, id);
    }
}
