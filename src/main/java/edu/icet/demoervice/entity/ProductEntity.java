package edu.icet.demoervice.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ProductEntity {
    private String code;
    private String description;
    private Double unitPrice;
    private Integer qtyOnHand;
}
