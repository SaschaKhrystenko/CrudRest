package com.crud.rest.repository;

import com.crud.rest.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShopRepository extends JpaRepository<Shop,Integer> {


   /* @Query("select s from Shop s JOIN product_shop ps ON ps.shop_id = s.id JOIN Product p ON ps.product_id = p.id  where p.mpn = :productName")
    List<Shop> findShopsByProduct (@Param("productName") String productName);*/
}
