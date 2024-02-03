package com.zara.productscoreapplication.mapper;

import com.zara.productscoreapplication.domain.Prices;
import com.zara.productscoreapplication.applicationxxx.response.PricesResponse;
import org.springframework.stereotype.Component;


@Component
public class PriceResponseMapper {
    public PricesResponse toPricesResponse(Prices prices){
        return
                PricesResponse.builder()
                        .price(prices.getPrice())
                        .startDate(prices.getStartDate())
                        .endDate(prices.getEndDate())
                        .priceList(prices.getPriceList())
                        .productId(prices.getProductId())
                        .priority(prices.getPriority())
                        .build();
    }
}
