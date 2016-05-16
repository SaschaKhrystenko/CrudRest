package com.crud.rest.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class Product {

    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String mpn;


    @ManyToMany()
    @JoinTable(name = "product_shop",
    joinColumns = @JoinColumn(name = "product_id"),
    inverseJoinColumns = @JoinColumn(name="shop_id"))
    private List<Shop> shopList;

    public Product() {
    }


    public Integer getId() {
        return id;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public List<Shop> getShopkList() {
        return shopList;
    }

    public void setShopkList(List<Shop> shopkList) {
        this.shopList = shopkList;
    }



}
