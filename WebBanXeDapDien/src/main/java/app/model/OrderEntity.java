package app.model;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.*;
public class OrderEntity implements Serializable {
    private Integer id;
    private String customerName;
    private String customerAdress;
    private String customerPhoneNumber;
    private String customerNote;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private AccountEntity accountByUserId;
    private AccountEntity accountByShipperId;
    private List<OrderDetailEntity> orderDetailEntities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AccountEntity getAccountByUserId() {
        return accountByUserId;
    }

    public void setAccountByUserId(AccountEntity accountByUserId) {
        this.accountByUserId = accountByUserId;
    }

    public AccountEntity getAccountByShipperId() {
        return accountByShipperId;
    }

    public void setAccountByShipperId(AccountEntity accountByShipperId) {
        this.accountByShipperId = accountByShipperId;
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
        OrderEntity that = (OrderEntity) o;
        return id == that.id &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerAdress, that.customerAdress) &&
                Objects.equals(customerPhoneNumber, that.customerPhoneNumber) &&
                Objects.equals(customerNote, that.customerNote) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, customerAdress, customerPhoneNumber, customerNote, status, createdAt, updatedAt);
    }




}
