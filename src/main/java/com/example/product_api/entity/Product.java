package com.example.product_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String description;
    private Double price;
  private Integer stock_quantity;
  private Long store_id;
  private String image_url;
  private int merchant_card_number;
  private int merchant_cvv ;

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getStock_quantity() {
    return stock_quantity;
  }

  public void setStock_quantity(Integer stock_quantity) {
    this.stock_quantity = stock_quantity;
  }

  public Long getStore_id() {
    return store_id;
  }

  public void setStore_id(Long store_id) {
    this.store_id = store_id;
  }

  public String getImage_url() {
    return image_url;
  }

  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }

  public int getMerchantCardNumber() {
    return merchant_card_number;
  }

  public void setMerchantCardNumber(Integer merchantCardNumber) {
    this.merchant_card_number = merchantCardNumber;
  }

  public Integer getMerchantCvv() {
    return merchant_cvv;
  }

  public void setMerchantCvv(Integer merchantCvv) {
    this.merchant_cvv = merchantCvv;
  }

  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", price=" + price +
      ", stock_quantity=" + stock_quantity +
      ", store_id=" + store_id +
      ", image_url='" + image_url + '\'' +
      ", merchantCardNumber=" + merchant_card_number +
      ", merchantCvv=" + merchant_cvv +
      '}';
  }
}
