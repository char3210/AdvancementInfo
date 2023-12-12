package de.guntram.mcmod.advancementinfo.mixin.accessors;

import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AdvancementTab.class)
public interface AdvancementTabAccessor {
    @Mutable
    @Accessor
    void setIndex(int i);
}
