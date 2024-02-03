package com.zara.productscoreapplication.domain;

import com.zara.productscoreapplication.services.PricesServiceJdbcImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PricesServiceJdbcImplTest {

    @Autowired
    private PricesServiceJdbcImpl cachingService;

    @Test
    void searchPricesByParameter() {
    }

    @Test
    void updateCachedData() {
    }
}