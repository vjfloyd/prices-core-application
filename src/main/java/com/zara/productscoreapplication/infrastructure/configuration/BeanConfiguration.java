package com.zara.productscoreapplication.infrastructure.configuration;


import com.github.benmanes.caffeine.cache.Caffeine;
import com.zara.productscoreapplication.PricesCoreApplication;
import com.zara.productscoreapplication.applicationxxx.ports.SearchPricesUseCase;
import com.zara.productscoreapplication.services.PricesServiceJdbcImpl;
import com.zara.productscoreapplication.mapper.PriceResponseMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.Duration;

@Configuration
@EnableCaching
@ComponentScan(basePackageClasses = PricesCoreApplication.class )
public class BeanConfiguration {

    @Bean
    SearchPricesUseCase pricesService(final JdbcTemplate jdbcTemplate, final PriceResponseMapper priceResponseMapper,
                                      @Value("${query.search-prices}") String query){
        return new PricesServiceJdbcImpl(jdbcTemplate, priceResponseMapper, query);
    }

    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager("prices"); // Define your cache names here
        cacheManager.setCaffeine(caffeineCacheBuilder());
        return cacheManager;
    }

    Caffeine<Object, Object> caffeineCacheBuilder() {
        return Caffeine.newBuilder()
                .initialCapacity(100)
                .maximumSize(500)
                .expireAfterWrite(Duration.ofMinutes(10));
    }

}
