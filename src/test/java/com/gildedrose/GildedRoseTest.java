package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void appleTest_quality() {
        Item item = updateSingleItem(new Item("Apple", 5, 5));
        assertEquals(4, item.quality);
    }

    @Test
    void appleTest_sellIn() {
        Item item = updateSingleItem(new Item("Apple", 5, 5));
        assertEquals(4, item.sellIn);
    }

    @Test
    void conjuredAppleTest_quality() {
        Item item = new Item("Conjured Apple", 5, 5);
        updateSingleItem(item);
        assertEquals(3, item.quality);
    }

    @Test
    void conjuredAppleTest_sellIn() {
        Item item = updateSingleItem(new Item("Conjured Apple", 5, 5));
        assertEquals(4, item.sellIn);
    }

    private Item updateSingleItem(Item item) {
        Item[] items = new Item[]{item};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return item;
    }

}
