package com.crud.rest.service;

import com.crud.rest.entity.Shop;
import com.crud.rest.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class ShopServiceImp implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    public Shop getShopById(Integer shopId) {
        return shopRepository.findOne(shopId);
    }

    public void saveShop(Shop shop) {
        shopRepository.saveAndFlush(shop);
    }

    public void updateShop(Shop oldShop) {
        shopRepository.saveAndFlush(oldShop);
    }

    public void deleteShop(Integer shopId) {
            shopRepository.delete(shopId);
    }

   /* public List<Shop> findShopsByProduct(String prodName) {
        return shopRepository.findShopsByProduct(prodName);
    }*/
}
