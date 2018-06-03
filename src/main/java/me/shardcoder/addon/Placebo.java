package me.shardcoder.addon;

import cc.hyperium.Hyperium;
import cc.hyperium.event.*;
import cc.hyperium.internal.addons.IAddon;

public class Placebo implements IAddon {

    @Override
    public void onLoad() {
        System.out.println("[Placebo] Addon loaded");
        EventBus.INSTANCE.register(this);
    }

    @InvokeEvent(priority = Priority.LOW)
    public void init(InitializationEvent event) {
        Hyperium.INSTANCE.getHandlers().getHyperiumCommandHandler().registerCommand(new PlaceboCommand());
    }

    @Override
    public void onClose() {
        System.out.println("[Placebo] Addon closed");
    }

    @Override
    public void sendDebugInfo() {
    }
}