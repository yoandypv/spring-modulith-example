package com.yoandypv.mm.orders.persistence;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrderRepository {

    public Order save(Order order) {
        log.info("Saving order {}", order);
        return order;
    }

}
