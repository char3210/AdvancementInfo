package de.guntram.mcmod.advancementinfo.mixin.accessors;

import net.minecraft.client.gui.screen.advancement.AdvancementTabType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AdvancementTabType.class)
public interface AdvancementTabTypeAccessor {
    @Accessor
    AdvancementTabType.Textures getSelectedTextures();
    @Accessor
    AdvancementTabType.Textures getUnselectedTextures();
}
