package com.yoandypv.mm.shopping.controller;

import com.yoandypv.mm.shopping.service.ShoppingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class ShoppingController {

    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ShoppingCart cart) {
         this.shoppingService.buy(cart);
         return ResponseEntity.accepted().build();
    }
}
