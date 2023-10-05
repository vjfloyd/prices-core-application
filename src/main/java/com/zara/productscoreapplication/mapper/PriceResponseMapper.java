package com.zara.productscoreapplication.mapper;

import com.zara.productscoreapplication.entity.PricesEntity;
import com.zara.productscoreapplication.resource.response.PricesResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PriceResponseMapper {
    public List<PricesResponse> toPricesResponse(List<PricesEntity> prices){
        return prices.stream().map( pricesEntity ->
                PricesResponse.builder()
                        .price(pricesEntity.getPrice())
                        .date(pricesEntity.getEndDate())
                        .priceList(pricesEntity.getPriceList())
                        .productId(pricesEntity.getProductId())
                        .build()).collect(Collectors.toList());
    }
}
