package com.yoandypv.mm.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductEvent {
   private long id;
   private int qty;
   private EventType operation;
}
