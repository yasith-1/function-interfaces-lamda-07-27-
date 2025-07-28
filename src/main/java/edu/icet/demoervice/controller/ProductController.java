package edu.icet.demoervice.controller;

import edu.icet.demoervice.dto.Product;
import edu.icet.demoervice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/api/product")
public class ProductController {
    final private ProductService productService;

    @GetMapping("/allproducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/lowstock")
    public List <Product> getLowLevelStock() {
        return productService.getLowLevelStock();
    }
}
