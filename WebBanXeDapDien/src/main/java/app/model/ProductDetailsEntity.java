package app.model;

import java.util.Objects;

public class ProductDetailsEntity {
    private Integer id;
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

    public Short getMotor() {
        return motor;
    }

    public void setMotor(Short motor) {
        this.motor = motor;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Short getSafeWeight() {
        return safeWeight;
    }

    public void setSafeWeight(Short safeWeight) {
        this.safeWeight = safeWeight;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getMaximumDistance() {
        return maximumDistance;
    }

    public void setMaximumDistance(Short maximumDistance) {
        this.maximumDistance = maximumDistance;
    }

    public Short getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(Short chargingTime) {
        this.chargingTime = chargingTime;
    }

    public String getTypeOfBattery() {
        return typeOfBattery;
    }

    public void setTypeOfBattery(String typeOfBattery) {
        this.typeOfBattery = typeOfBattery;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getAccessoriesIncluded() {
        return accessoriesIncluded;
    }

    public void setAccessoriesIncluded(String accessoriesIncluded) {
        this.accessoriesIncluded = accessoriesIncluded;
    }

    public Object getLongs() {
        return longs;
    }


    public Object getWide() {
        return wide;
    }


    public Object getHight() {
        return hight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getWarrantyBattery() {
        return warrantyBattery;
    }

    public void setWarrantyBattery(Byte warrantyBattery) {
        this.warrantyBattery = warrantyBattery;
    }

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
