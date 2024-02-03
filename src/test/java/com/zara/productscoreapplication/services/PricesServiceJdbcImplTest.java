package com.zara.productscoreapplication.services;

import com.zara.productscoreapplication.domain.Prices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PricesServiceJdbcImplTest {

    @Autowired
    private PricesServiceJdbcImpl pricesServiceJdbcImpl;

    @Test
    void whenStartDateIs14_10_00H() {
        String date = "2020-06-14-10.00.00";
        Prices price = pricesServiceJdbcImpl.searchPricesByParameter(date, 35455L, 1L);
        Assertions.assertTrue(price.getPrice().doubleValue() == 35.50);
    }

    @Test
    void whenStartDateIs14_16_00H() {
        String date = "2020-06-14-16.00.00";
        Prices price = pricesServiceJdbcImpl.searchPricesByParameter(date, 35455L, 1L);
        Assertions.assertEquals(price.getPrice().doubleValue(), 25.45);
    }

    @Test
    void whenStartDateIs14_21_00H() {
        String date = "2020-06-14-21.00.00";
        Prices price = pricesServiceJdbcImpl.searchPricesByParameter(date, 35455L, 1L);
        Assertions.assertEquals(price.getPrice().doubleValue(), 35.50);
    }


    @Test
    void whenStartDateIs15_10_00H() {
        String date = "2020-06-15-10.00.00";
        Prices price = pricesServiceJdbcImpl.searchPricesByParameter(date, 35455L, 1L);
        Assertions.assertEquals(price.getPrice().doubleValue(), 30.50);
    }

    @Test
    void whenStartDateIs16_21_00H() {
        String date = "2020-06-16-21.00.00";
        Prices prices = pricesServiceJdbcImpl.searchPricesByParameter(date, 35455L, 1L);
        Assertions.assertEquals(prices.getPrice().doubleValue(), 38.95);
    }

}
