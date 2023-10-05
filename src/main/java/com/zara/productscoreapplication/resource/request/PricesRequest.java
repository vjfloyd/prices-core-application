package com.zara.productscoreapplication.resource.request;

import lombok.*;

@Setter
@Getter
public class PricesRequest {
    private String date;
    private Long productId;
    private Long brandId;

    public PricesRequest(String date, Long productId, Long brandId) {
        this.date = date;
        this.productId = productId;
        this.brandId = brandId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
