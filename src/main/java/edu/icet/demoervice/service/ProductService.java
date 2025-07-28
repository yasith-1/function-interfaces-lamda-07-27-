package edu.icet.demoervice.service;

import edu.icet.demoervice.dto.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    List<Product> getLowLevelStock();
}
