
package com.example.tp4.web;

import com.example.tp4.dao.entities.Product;
import com.example.tp4.metier.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductManager productManager;

    @GetMapping("/getProductsList")
    public String getALlProducts(Model model) {
        List<Product> products = productManager.GetAllProduct();
        model.addAttribute("listProduits", products);
        return "listProduit" ;
    }

    @GetMapping("/ajouterproduit")
    public String addProduct(Model model) {
        return "addProduit";
    }

    @PostMapping("ajouterproduit")
    public String addproductdb(Model model, @RequestParam(name = "description") String description,
                               @RequestParam(name = "price") double price) {
        Product product = new Product();
        product.setDescription(description);
        product.setPrice(price);
        productManager.addproduct(product);
        return getALlProducts(model);
    }
}
