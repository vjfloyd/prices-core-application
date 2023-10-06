package com.zara.productscoreapplication.services;

import com.zara.productscoreapplication.resource.response.PricesResponse;

import java.util.List;

public interface PricesService {
    PricesResponse find(String dateTime, Long productId, Long brandId);

}

