package org.societies.bridge.sponge;

import com.google.inject.name.Named;
import org.societies.bridge.Scheduler;

/**
 * Represents a SpongeScheduler
 */
public class SpongeScheduler implements Scheduler {

    private final org.spongepowered.api.service.scheduler.Scheduler scheduler;
    private final Object plugin;

    public SpongeScheduler(org.spongepowered.api.service.scheduler.Scheduler scheduler, @Named("plugin") Object plugin) {
        this.scheduler = scheduler;
        this.plugin = plugin;
    }

    @Override
    public void scheduleSyncRepeatingTask(Runnable task, long period) {
        scheduler.runRepeatingTask(plugin, task, period);
    }
}
