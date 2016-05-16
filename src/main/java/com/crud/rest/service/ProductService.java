package com.crud.rest.service;


import com.crud.rest.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(Integer productId);
    public void saveProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Integer productId);
    public Product getByName(String name);
    public List<Product>getProductsByShop(Integer shopId);
}
