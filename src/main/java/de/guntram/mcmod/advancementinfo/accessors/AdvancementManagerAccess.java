package de.guntram.mcmod.advancementinfo.accessors;

import net.minecraft.advancement.AdvancementManager;
import net.minecraft.advancement.PlacedAdvancement;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(AdvancementManager.class)
public interface AdvancementManagerAccess {
	@Accessor("advancements")
	public Map<Identifier, PlacedAdvancement> getAdvancementEntries();
}
