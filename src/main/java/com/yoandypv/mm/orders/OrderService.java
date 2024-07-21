package com.yoandypv.mm.orders;

import com.yoandypv.mm.dto.order.OrderDTO;

public interface OrderService {
    void create(OrderDTO order);
}
