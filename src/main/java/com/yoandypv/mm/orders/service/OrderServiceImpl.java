package com.yoandypv.mm.orders.service;

import com.yoandypv.mm.dto.order.OrderDTO;
import com.yoandypv.mm.dto.product.EventType;
import com.yoandypv.mm.dto.product.ProductEvent;
import com.yoandypv.mm.orders.OrderService;
import com.yoandypv.mm.orders.persistence.Order;
import com.yoandypv.mm.orders.persistence.OrderRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ApplicationEventPublisher publisher;

    public OrderServiceImpl(OrderRepository orderRepository, ApplicationEventPublisher publisher) {
        this.orderRepository = orderRepository;
        this.publisher = publisher;
    }


    @Transactional
    public void create(OrderDTO order) {
        orderRepository.save(new Order(order.getProductId(), order.getQty(), order.getDesc()));
        this.publisher.publishEvent(new ProductEvent(order.getProductId(), order.getQty(), EventType.DECR));
    }
}
