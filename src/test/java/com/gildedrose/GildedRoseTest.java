package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void should_update_quality_and_sellIn() {
        Item[] items = new Item[] { new Item("foo", 1, 5) };
        GildedRose app = new GildedRose(items);

        app.update();
        Item[] updatedItems = app.getItems();

        assertEquals("foo", updatedItems[0].name);
        assertEquals(4, updatedItems[0].quality);
        assertEquals(0, updatedItems[0].sellIn);
    }

}
