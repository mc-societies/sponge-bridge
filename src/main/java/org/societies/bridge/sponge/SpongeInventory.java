package org.societies.bridge.sponge;

import org.societies.bridge.Inventory;
import org.societies.bridge.ItemStack;

/**
 * Represents a SpongeInventory
 */
//fixme
public class SpongeInventory implements Inventory {
    @Override
    public ItemStack[] getContents() {
        return new ItemStack[0];
    }

    @Override
    public void remove(ItemStack itemStack) {

    }

    @Override
    public ItemStack getHelmet() {
        return null;
    }

    @Override
    public ItemStack getLeggings() {
        return null;
    }

    @Override
    public ItemStack getChestplate() {
        return null;
    }

    @Override
    public ItemStack getBoots() {
        return null;
    }
}
