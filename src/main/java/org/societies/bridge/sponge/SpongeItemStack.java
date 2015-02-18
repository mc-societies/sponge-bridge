package org.societies.bridge.sponge;

import org.societies.bridge.ItemStack;
import org.societies.bridge.Material;

/**
 * Represents a SpongeItemStack
 */
public class SpongeItemStack implements ItemStack {

    private final org.spongepowered.api.item.inventory.ItemStack itemStack;

    public SpongeItemStack(org.spongepowered.api.item.inventory.ItemStack itemStack) {
        if (itemStack == null) {
            throw new IllegalArgumentException("ItemStack mustn't be null!");
        }

        this.itemStack = itemStack;
    }


    @Override
    public int getAmount() {
        return itemStack.getQuantity();
    }

    @Override
    public Material getType() {
        return new SpongeMaterial(itemStack.getItem());
    }
}
