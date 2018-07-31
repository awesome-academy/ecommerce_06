package app.Bean;


import app.model.AccountEntity;
import app.model.OrdersDetailsEntity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class Orders {

  private Integer id;
  private String customerName;
  private String customerAdress;
  private String customerPhoneNumber;
  private String customerNote;
  private String status;
  private Timestamp createdAt;
  private Timestamp updatedAt;
  private Account accountByUserId;
  private Account accountByShipperId;
  private Set<OrdersDetails> ordersDetails = new HashSet<>(0);

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

  public Account getAccountByUserId() {
    return accountByUserId;
  }

  public void setAccountByUserId(Account accountByUserId) {
    this.accountByUserId = accountByUserId;
  }

  public Account getAccountByShipperId() {
    return accountByShipperId;
  }

  public void setAccountByShipperId(Account accountByShipperId) {
    this.accountByShipperId = accountByShipperId;
  }

  public Set<OrdersDetails> getOrdersDetails() {
    return ordersDetails;
  }

  public void setOrdersDetails(Set<OrdersDetails> ordersDetails) {
    this.ordersDetails = ordersDetails;
  }
}
