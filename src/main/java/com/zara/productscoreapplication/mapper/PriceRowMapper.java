package com.zara.productscoreapplication.mapper;


import com.zara.productscoreapplication.entity.PricesEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class PriceRowMapper implements RowMapper<PricesEntity> {
    @Override
    public PricesEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return  PricesEntity.builder()
                .brandId(rs.getNString("brand_id"))
                .price(rs.getBigDecimal("price"))
                .priceList(rs.getInt("price_list"))
                .startDate(rs.getNString("start_date"))
                .endDate(rs.getNString("end_date"))
                .currency(rs.getNString("currency"))
                .productId(rs.getLong("product_id"))
                .priority(rs.getLong("priority"))
                .build();
    }
}
