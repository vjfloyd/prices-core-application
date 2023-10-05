package com.zara.productscoreapplication.repository;

import com.zara.productscoreapplication.entity.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricesRepository extends JpaRepository<PricesEntity, Long> {
}
