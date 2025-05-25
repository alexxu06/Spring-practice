package com.example.practicespringboot.controllers;

import com.example.practicespringboot.model.Product;
import com.example.practicespringboot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductsController {
    private final ProductService productService;

    @Autowired //only required if 2+ constructors, but I added for practice
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping("/products")
    public String addProducts(Model model,
//                              @RequestParam String name,
//                              @RequestParam double price
                               Product p) {
//        Product p = new Product();
//        p.setName(name);
//        p.setPrice(price);
        productService.addProduct(p);

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}
