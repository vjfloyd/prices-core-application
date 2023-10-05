package com.zara.productscoreapplication.resource.response;

import lombok.Builder;
import java.math.BigDecimal;

@Builder
public record PricesResponse (Long productId, BigDecimal price, String date, Integer priceList){
}
