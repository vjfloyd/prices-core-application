package com.zara.productscoreapplication.mapper;

import com.zara.productscoreapplication.entity.PricesEntity;
import com.zara.productscoreapplication.resource.response.PricesResponse;
import org.springframework.stereotype.Component;


@Component
public class PriceResponseMapper {
    public PricesResponse toPricesResponse(PricesEntity pricesEntity){
        return
                PricesResponse.builder()
                        .price(pricesEntity.getPrice())
                        .startDate(pricesEntity.getStartDate())
                        .endDate(pricesEntity.getEndDate())
                        .priceList(pricesEntity.getPriceList())
                        .productId(pricesEntity.getProductId())
                        .priority(pricesEntity.getPriority())
                        .build();
    }
}
