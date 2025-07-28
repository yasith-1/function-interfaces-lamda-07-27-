package edu.icet.demoervice.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demoervice.dto.Product;
import edu.icet.demoervice.repository.ProductRepository;
import edu.icet.demoervice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ObjectMapper mapper;

    @Override
    public List<Product> getAllProducts() {
        return repository.getAllProducts()
                .stream()
                .map((productEntity) -> mapper.convertValue(productEntity, Product.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getLowLevelStock() {
        return repository.getAllProducts()
                .stream()
                .filter(productEntity -> productEntity.getQtyOnHand() <= 50)
                .map((productEntity) -> mapper.convertValue(productEntity, Product.class))
                .collect(Collectors.toList());
    }
}
