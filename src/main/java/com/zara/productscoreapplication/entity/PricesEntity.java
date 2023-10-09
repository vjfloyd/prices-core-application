package com.zara.productscoreapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "products")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PricesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand_id")
    private String brandId;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;
    @Column(name = "price_list")
    private Integer priceList;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "price")
    private Number price;
    @Column(name = "currency")
    private String currency;
    @Column(name = "priority")
    private Long priority;

}