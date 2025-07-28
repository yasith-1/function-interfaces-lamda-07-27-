package edu.icet.demoervice.repository;

import edu.icet.demoervice.dto.Product;
import edu.icet.demoervice.entity.ProductEntity;

import java.util.List;

public interface ProductRepository {
     List<ProductEntity> getAllProducts() ;
}
