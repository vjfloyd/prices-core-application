package com.zara.productscoreapplication.services;

import com.zara.productscoreapplication.resource.response.PricesResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PricesServiceJdbcImplTest {

    @Autowired
    private PricesServiceJdbcImpl pricesServiceJdbcImpl;

    @Test
    void whenStartDateIs14_10_00H() {
        String date = "2020-06-14-10.00.00";
        PricesResponse price = pricesServiceJdbcImpl.find(date, 35455L, 1L);
        Assertions.assertTrue(price.price().doubleValue() == 35.50);
    }

    @Test
    void whenStartDateIs14_16_00H() {
        String date = "2020-06-14-16.00.00";
        PricesResponse price = pricesServiceJdbcImpl.find(date, 35455L, 1L);
        Assertions.assertEquals(price.price().doubleValue(), 25.45);
    }

    @Test
    void whenStartDateIs14_21_00H() {
        String date = "2020-06-14-21.00.00";
        PricesResponse price = pricesServiceJdbcImpl.find(date, 35455L, 1L);
        Assertions.assertEquals(price.price().doubleValue(), 35.50);
    }


    @Test
    void whenStartDateIs15_10_00H() {
        String date = "2020-06-15-10.00.00";
        PricesResponse price = pricesServiceJdbcImpl.find(date, 35455L, 1L);
        Assertions.assertEquals(price.price().doubleValue(), 30.50);
    }

    @Test
    void whenStartDateIs16_21_00H() {
        String date = "2020-06-16-21.00.00";
        PricesResponse prices = pricesServiceJdbcImpl.find(date, 35455L, 1L);
        Assertions.assertEquals(prices.price().doubleValue(), 38.95);
    }

}
