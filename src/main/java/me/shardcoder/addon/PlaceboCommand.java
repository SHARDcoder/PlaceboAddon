package me.shardcoder.addon;

import cc.hyperium.Hyperium;
import cc.hyperium.commands.BaseCommand;
import cc.hyperium.commands.CommandException;
import cc.hyperium.gui.settings.items.CosmeticSettings;
import cc.hyperium.utils.ChatColor;

public class PlaceboCommand implements BaseCommand {
    @Override
    public String getName() {
        return "placebo";
    }

    @Override
    public String getUsage() {
        return "/placebo";
    }

    @Override
    public void onExecute(String[] strings) throws CommandException {
        Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6[&ePlacebo&6] &fHi. This is &3dablord Sk1er&f's fps boosting\n&6[&ePlacebo&6] &fplacebo mod, kindly ported to addon by\n&6[&ePlacebo&6] &aSHARDcoder"), false);
    }
}
