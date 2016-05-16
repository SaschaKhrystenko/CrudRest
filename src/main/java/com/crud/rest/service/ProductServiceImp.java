package com.crud.rest.service;


import com.crud.rest.entity.Product;
import com.crud.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer productId) {

        return  productRepository.findOne(productId);
    }

    public void saveProduct(Product product) {
            productRepository.save(product);
    }

    public void deleteProduct(Integer productId) {
         productRepository.delete(productId);
    }

    public Product getByName(String name) {
        return productRepository.findByName(name);
    }


    public void updateProduct(Product product) {
            productRepository.saveAndFlush(product);

    }

    public List<Product> getProductsByShop(Integer shopId) {
        return productRepository.getProductsByShop(shopId);
    }
}
