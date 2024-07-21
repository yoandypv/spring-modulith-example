package com.yoandypv.mm.orders.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private long productId;
    private int qty;
    private String desc;
}
