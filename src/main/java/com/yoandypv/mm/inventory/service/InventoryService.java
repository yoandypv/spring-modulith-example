package com.yoandypv.mm.inventory.service;

import com.yoandypv.mm.dto.product.ProductEvent;
import com.yoandypv.mm.inventory.persistence.InventoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @ApplicationModuleListener
    public void on(ProductEvent event)  {
        log.info("Event received, product data:  {}", event);

    }
}
