package com.zara.productscoreapplication.resource.response;

import lombok.Builder;

@Builder
public record PricesResponse (Long productId, Number price, String startDate,String endDate,
                              Integer priceList, Long priority){
}
