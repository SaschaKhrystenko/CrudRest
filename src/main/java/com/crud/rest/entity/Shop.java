package com.crud.rest.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class Shop {

    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column(name ="price" )
    private Double price;

    @Column(name = "stock")
    @Enumerated(EnumType.ORDINAL)
    private StockStatus stockStatus;

    public enum StockStatus {
        NO,LACK,ENOUGH
    }

    @ManyToMany()
    @JoinTable(name = "product_shop",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name="product_id"))
    private List<Product> productList;



    public Shop() {
    }


    public Integer getId() {
        return id;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public StockStatus getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(StockStatus stockStatus) {
        this.stockStatus = stockStatus;
    }
}

