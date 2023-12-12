package de.guntram.mcmod.advancementinfo.duck;

import net.minecraft.advancement.PlacedAdvancement;
import net.minecraft.client.gui.screen.advancement.AdvancementTab;

public interface IAdvancementsScreen {
    AdvancementTab myGetTab(PlacedAdvancement advancement);
    int getTabScrollPos();
}
