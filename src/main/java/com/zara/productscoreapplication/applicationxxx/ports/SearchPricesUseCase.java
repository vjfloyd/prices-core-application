package com.zara.productscoreapplication.applicationxxx.ports;

import com.zara.productscoreapplication.domain.Prices;

public interface SearchPricesUseCase {

    Prices searchPricesByParameter(String date,Long productId,Long brandId);
}
