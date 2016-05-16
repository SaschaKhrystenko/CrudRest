package com.crud.rest.controller;

import com.crud.rest.entity.Product;
import com.crud.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductRestController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Product> getProduct() {
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", headers = "content-type = application/json")
    public void addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable Integer productId) {

       productService.deleteProduct(productId);
    }

    @RequestMapping(value = "/id/{productId}",method = RequestMethod.GET)
    @ResponseBody
    public Product getProductById(@PathVariable Integer productId){
        return productService.getProductById(productId);
    }

    @RequestMapping(value = "/{productName}",method = RequestMethod.GET)
    @ResponseBody
    public Product getProductByName(@PathVariable String productName){
        return productService.getByName(productName);
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", headers = "content-type = application/json")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @RequestMapping(value = "/shop{shopId}",method = RequestMethod.GET)
    public List<Product> getProductsByShopId(@PathVariable("shopId")Integer shopId){
        return productService.getProductsByShop(shopId);
    }
}
