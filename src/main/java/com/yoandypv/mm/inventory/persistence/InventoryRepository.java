package com.yoandypv.mm.inventory.persistence;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class InventoryRepository {

    public void save(Inventory inventory) {
        log.info("Inventory updated {}", inventory);
    }
}
