package com.yoandypv.mm.dto.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDTO {
    private long productId;
    private int qty;
    private String desc;
}
