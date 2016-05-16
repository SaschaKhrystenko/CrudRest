package com.crud.rest.service;

import com.crud.rest.entity.Shop;


import java.util.List;



public interface ShopService {

    public List<Shop> getAllShops();
    public Shop getShopById(Integer shopId);
    public void saveShop(Shop shop );
    public void updateShop(Shop oldShop);
    public void deleteShop(Integer shopId);
    public List<Shop> findShopsByProduct(String prodName);
}
