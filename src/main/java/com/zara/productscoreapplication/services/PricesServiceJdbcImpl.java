package com.zara.productscoreapplication.services;

import com.zara.productscoreapplication.applicationxxx.ports.SearchPricesUseCase;
import com.zara.productscoreapplication.domain.Prices;
import com.zara.productscoreapplication.mapper.PriceResponseMapper;
import com.zara.productscoreapplication.mapper.PriceRowMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Comparator;

@Slf4j
public class PricesServiceJdbcImpl implements SearchPricesUseCase {
    private JdbcTemplate jdbcTemplate;
    private PriceResponseMapper priceResponseMapper;
    private String sqlQuery;

    public PricesServiceJdbcImpl(JdbcTemplate jdbcTemplate, PriceResponseMapper priceResponseMapper,
                                   String sqlQuery) {
        this.jdbcTemplate = jdbcTemplate;
        this.priceResponseMapper = priceResponseMapper;
        this.sqlQuery = sqlQuery;
    }

    @Override
    public Prices searchPricesByParameter(String dateTime, Long productId, Long brandId) {
        log.info("[searchPricesByParameter]");

        Prices prices = jdbcTemplate.query(sqlQuery,
                        new Object[] { dateTime , dateTime, productId, brandId}, new PriceRowMapper())
                .stream()
                .max(Comparator.comparing(Prices::getPriority))
                .orElseThrow();
        return  prices;
    }


}
