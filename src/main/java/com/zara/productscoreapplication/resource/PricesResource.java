package com.zara.productscoreapplication.resource;

import com.zara.productscoreapplication.resource.response.PricesResponse;
import com.zara.productscoreapplication.services.PricesServiceJdbcImpl;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/application-services/v1/products")
public class PricesResource {
    private PricesServiceJdbcImpl pricesServiceJdbcImpl;
    public PricesResource(PricesServiceJdbcImpl pricesServiceJdbcImpl) {
        this.pricesServiceJdbcImpl = pricesServiceJdbcImpl;
    }
    @GetMapping
    public PricesResponse getProducts(@Valid @RequestParam @NotBlank @Size(max = 19) String date,
                                            @Valid @RequestParam @Positive Long productId,
                                            @Valid @RequestParam @Positive Long brandId){
        return pricesServiceJdbcImpl.find(date, productId, brandId);
    }
}
