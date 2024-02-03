package com.zara.productscoreapplication.application;

import com.zara.productscoreapplication.applicationxxx.ports.SearchPricesUseCase;
import com.zara.productscoreapplication.domain.Prices;
import com.zara.productscoreapplication.services.PricesServiceJdbcImpl;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequestMapping("/sells-services/v1/prices")
public class PricesController {
    private PricesServiceJdbcImpl pricesServiceJdbc;

    @GetMapping
    public Prices findPrice(@Valid @RequestParam @NotBlank @Size(max = 19) String date,
                           @Valid @RequestParam @Positive Long productId,
                           @Valid @RequestParam @Positive Long brandId){

        return pricesServiceJdbc.searchPricesByParameter(date, productId, brandId);
    }

}
