package com.yoandypv.mm.shopping.service;

import com.yoandypv.mm.dto.order.OrderDTO;
import com.yoandypv.mm.orders.OrderService;
import com.yoandypv.mm.orders.service.OrderServiceImpl;
import com.yoandypv.mm.shopping.controller.ShoppingCart;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShoppingService {

    private final OrderService orderService;

    public ShoppingService(OrderService orderService) {
        this.orderService = orderService;
    }

    @SneakyThrows
    public void buy(ShoppingCart cart) {
       log.info("Shopping card data {}", cart);
       Thread.sleep(2000);
       orderService.create(new OrderDTO(cart.getProductId(), cart.getQty(), "product 1"));
       // do other things
    }
}
