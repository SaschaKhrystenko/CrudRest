package com.crud.rest.repository;

import com.crud.rest.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ShopRepository extends JpaRepository<Shop,Integer> {


    //@Query("select s from Shop shop JOIN product_shop ps ON ps.shop_id = s.id JOIN Product p ON ps.product_id = p.id  where p.mpn = :productName")

    @Query("select s FROM Shop s JOIN s.productList pr WHERE pr.mpn =:productName")
    List<Shop> findShopsByProduct (@Param("productName") String productName);
}
