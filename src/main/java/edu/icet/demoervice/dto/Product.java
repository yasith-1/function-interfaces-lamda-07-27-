package edu.icet.demoervice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Product {
    private String code;
    private String description;
    private Double unitPrice;
    private Integer qtyOnHand;

}
