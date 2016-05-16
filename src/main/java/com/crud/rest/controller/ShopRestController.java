package com.crud.rest.controller;

import com.crud.rest.entity.Shop;
import com.crud.rest.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/shops")
public class ShopRestController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Shop> getShop() {
        return shopService.getAllShops();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", headers = "content-type = application/json")
    public void addShop(@RequestBody Shop shop) {
        shopService.saveShop(shop);
    }

    @RequestMapping(value = "/{shopId}", method = RequestMethod.DELETE)
    public void deleteShop(@PathVariable Integer shopId) {

        shopService.deleteShop(shopId);
    }

    @RequestMapping(value = "/id/{shopId}",method = RequestMethod.GET)
    @ResponseBody
    public Shop getShopById(@PathVariable Integer shopId){
        return shopService.getShopById(shopId);
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", headers = "content-type = application/json")
    public void updateShop(@RequestBody Shop shop) {
        shopService.updateShop(shop);
    }

    /*@RequestMapping(value = "/product/{name}",method = RequestMethod.GET)
    @ResponseBody
    public List<Shop> getShopsByProductName(@PathVariable String productName){
        return shopService.findShopsByProduct(productName);
    }*/

}
