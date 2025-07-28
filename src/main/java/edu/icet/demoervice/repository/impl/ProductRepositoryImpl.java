package edu.icet.demoervice.repository.impl;

import edu.icet.demoervice.entity.ProductEntity;
import edu.icet.demoervice.mapper.ProductEntityMapper;
import edu.icet.demoervice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<ProductEntity> getAllProducts() {
       //return jdbcTemplate.query("SELECT * FROM `item`", new BeanPropertyRowMapper<ProductEntity>()); // used default mapper (BeanPropertyRowMapper)
        return jdbcTemplate.query("SELECT * FROM `item`", new ProductEntityMapper()); //without Lamda expression
    }
}
