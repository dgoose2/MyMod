package com.dgoose.mod.items;

import com.dgoose.mod.Tutorial;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Tutorial.TAB));
    }
}
