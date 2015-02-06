package org.societies.bridge.sponge;

import org.societies.bridge.ItemStack;
import org.societies.bridge.Location;
import org.societies.bridge.World;

import java.util.UUID;

/**
 * Represents a SpongeWorld
 */
public class SpongeWorld implements World {

    private final org.spongepowered.api.world.World world;

    public SpongeWorld(org.spongepowered.api.world.World world) {
        this.world = world;
    }

    @Override
    public void dropItem(Location location, ItemStack itemStack) {

    }

    @Override
    public UUID getUUID() {
        return world.getUniqueID();
    }

    @Override
    public String getName() {
        return world.getName();
    }
}
