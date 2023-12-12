package de.guntram.mcmod.advancementinfo.mixin;

import de.guntram.mcmod.advancementinfo.duck.IClientAdvancementManager;
import net.minecraft.client.network.ClientAdvancementManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientAdvancementManager.class)
public class ClientAdvancementManagerMixin implements IClientAdvancementManager {
    private int tabScrollPos;

    @Override
    public int getTabScrollPos() {
        return tabScrollPos;
    }

    public void setTabScrollPos(int tabScrollPos) {
        this.tabScrollPos = tabScrollPos;
    }
}
