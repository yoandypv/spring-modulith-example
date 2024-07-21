package com.yoandypv.mm.shopping.controller;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShoppingCart {
    private int productId;
    private int qty;
    private BigDecimal unitPrice;
}
