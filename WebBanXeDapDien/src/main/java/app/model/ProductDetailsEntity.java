package app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Product_Details", schema = "QuanLyXeDien", catalog = "")
public class ProductDetailsEntity {
    private short id;
    private ProductsEntity productsEntity;
    private Short motor;
    private String operate;
    private float speed;
    private Short safeWeight;
    private Short weight;
    private Short maximumDistance;
    private Short chargingTime;
    private String typeOfBattery;
    private String tires;
    private String accessoriesIncluded;
    private float longs;
    private float wide;
    private float hight;
    private Byte warrantyBattery;
    private Byte warrantyMotor;

    public void setLongs(float longs) {
        this.longs = longs;
    }

    public void setWide(float wide) {
        this.wide = wide;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public ProductsEntity getProductsEntity() {
        return productsEntity;
    }

    public void setProductsEntity(ProductsEntity productsEntity) {
        this.productsEntity = productsEntity;
    }

    @Basic
    @Column(name = "Motor", nullable = true)
    public Short getMotor() {
        return motor;
    }

    public void setMotor(Short motor) {
        this.motor = motor;
    }

    @Basic
    @Column(name = "Operate", nullable = true, length = 50)
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @Basic
    @Column(name = "Speed", nullable = true, precision = 0)
    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "Safe_Weight", nullable = true)
    public Short getSafeWeight() {
        return safeWeight;
    }

    public void setSafeWeight(Short safeWeight) {
        this.safeWeight = safeWeight;
    }

    @Basic
    @Column(name = "Weight", nullable = true)
    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "Maximum_Distance", nullable = true)
    public Short getMaximumDistance() {
        return maximumDistance;
    }

    public void setMaximumDistance(Short maximumDistance) {
        this.maximumDistance = maximumDistance;
    }

    @Basic
    @Column(name = "Charging_Time", nullable = true)
    public Short getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(Short chargingTime) {
        this.chargingTime = chargingTime;
    }

    @Basic
    @Column(name = "Type_Of_Battery", nullable = true, length = 50)
    public String getTypeOfBattery() {
        return typeOfBattery;
    }

    public void setTypeOfBattery(String typeOfBattery) {
        this.typeOfBattery = typeOfBattery;
    }

    @Basic
    @Column(name = "Tires", nullable = true, length = 50)
    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    @Basic
    @Column(name = "Accessories_included", nullable = true, length = 50)
    public String getAccessoriesIncluded() {
        return accessoriesIncluded;
    }

    public void setAccessoriesIncluded(String accessoriesIncluded) {
        this.accessoriesIncluded = accessoriesIncluded;
    }

    @Basic
    @Column(name = "Longs", nullable = true, precision = 0)
    public Object getLongs() {
        return longs;
    }


    @Basic
    @Column(name = "Wide", nullable = true, precision = 0)
    public Object getWide() {
        return wide;
    }


    @Basic
    @Column(name = "Hight", nullable = true, precision = 0)
    public Object getHight() {
        return hight;
    }


    @Id
    @Column(name = "id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Warranty_Battery", nullable = true)
    public Byte getWarrantyBattery() {
        return warrantyBattery;
    }

    public void setWarrantyBattery(Byte warrantyBattery) {
        this.warrantyBattery = warrantyBattery;
    }

    @Basic
    @Column(name = "Warranty_Motor", nullable = true)
    public Byte getWarrantyMotor() {
        return warrantyMotor;
    }

    public void setWarrantyMotor(Byte warrantyMotor) {
        this.warrantyMotor = warrantyMotor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetailsEntity that = (ProductDetailsEntity) o;
        return id == that.id &&
                Objects.equals(motor, that.motor) &&
                Objects.equals(operate, that.operate) &&
                Objects.equals(speed, that.speed) &&
                Objects.equals(safeWeight, that.safeWeight) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(maximumDistance, that.maximumDistance) &&
                Objects.equals(chargingTime, that.chargingTime) &&
                Objects.equals(typeOfBattery, that.typeOfBattery) &&
                Objects.equals(tires, that.tires) &&
                Objects.equals(accessoriesIncluded, that.accessoriesIncluded) &&
                Objects.equals(longs, that.longs) &&
                Objects.equals(wide, that.wide) &&
                Objects.equals(hight, that.hight) &&
                Objects.equals(warrantyBattery, that.warrantyBattery) &&
                Objects.equals(warrantyMotor, that.warrantyMotor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motor, operate, speed, safeWeight, weight, maximumDistance, chargingTime, typeOfBattery, tires, accessoriesIncluded, longs, wide, hight, id, warrantyBattery, warrantyMotor);
    }
}
