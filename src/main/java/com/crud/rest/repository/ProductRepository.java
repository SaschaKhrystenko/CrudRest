package com.crud.rest.repository;

import com.crud.rest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("select p from Product p where p.mpn = :name")
    Product findByName(@Param("name") String name);

    @Query("SELECT p FROM Product p JOIN p.shopList shop where shop.id = :shopId")
    List<Product> getProductsByShop(@Param("shopId") Integer shopId);





}
