package com.zara.productscoreapplication.services;

import com.zara.productscoreapplication.entity.PricesEntity;
import com.zara.productscoreapplication.mapper.PriceResponseMapper;
import com.zara.productscoreapplication.mapper.PriceRowMapper;
import com.zara.productscoreapplication.resource.response.PricesResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class PricesServiceJdbcImpl implements PricesService{
    private JdbcTemplate jdbcTemplate;
    private PriceResponseMapper priceResponseMapper;
    private String sqlQuery;

    public PricesServiceJdbcImpl(JdbcTemplate jdbcTemplate, PriceResponseMapper priceResponseMapper,
                                  @Value("${query.search-prices}") String sqlQuery) {
        this.jdbcTemplate = jdbcTemplate;
        this.priceResponseMapper = priceResponseMapper;
        this.sqlQuery = sqlQuery;
    }

    public List<PricesResponse> find(String dateTime, Long productId, Long brandId) {

      List<PricesEntity> prices = jdbcTemplate.query(sqlQuery,
                    new Object[] { dateTime , productId, brandId}, new PriceRowMapper());
      return priceResponseMapper.toPricesResponse(prices);
    }
}
