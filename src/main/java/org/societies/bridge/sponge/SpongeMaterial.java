package org.societies.bridge.sponge;

import org.societies.bridge.Material;
import org.spongepowered.api.item.ItemType;

/**
 * Represents a BukkitMaterial
 */
public class SpongeMaterial implements Material {

    private final ItemType item;

    public SpongeMaterial(ItemType item) {this.item = item;}

    @SuppressWarnings("deprecation")
    @Override
    public int getID() {
        return 0; //fixme
    }

    @Override
    public String getName() {
        return item.getId();
    }

    @Override
    public String getInternalName() {
        return item.getId();
    }

    @Override
    public boolean isFood() {
        return false;
    }

    @Override
    public int getFoodLevel() {
        return 0;
    }

    @Override
    public boolean isBoot() {
        return false;
    }

    @Override
    public boolean isHelmet() {
        return false;
    }

    @Override
    public boolean isChestplate() {
        return false;
    }

    @Override
    public boolean isLeggings() {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }
}
