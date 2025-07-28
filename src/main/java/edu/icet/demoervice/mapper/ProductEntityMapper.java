package edu.icet.demoervice.mapper;

import edu.icet.demoervice.entity.ProductEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductEntityMapper implements RowMapper <ProductEntity>{

    public ProductEntityMapper(){
        super();
    }

    @Override
    public ProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

        ProductEntity entity = new ProductEntity();
        entity.setCode(rs.getString("code"));
        entity.setDescription(rs.getString("description"));
        entity.setUnitPrice(rs.getDouble("unitPrice"));
        entity.setQtyOnHand(rs.getInt("qtyOnHand"));

        return entity;
    }
}
