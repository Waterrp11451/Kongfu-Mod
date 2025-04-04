package net.waterrp11451.kongfumod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.waterrp11451.kongfumod.KongfuMod;

import java.util.function.Supplier;
//Create a creative tab
public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KongfuMod.MODID);
    public static final String KONGFU_MOD_TAB_STRING="creative.kongfu_tab";
    public static final Supplier<CreativeModeTab> EXAMPLE_TAB  = CREATIVE_MODE_TABS.register("kongfu_tab",() -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
           .title(Component.translatable(KONGFU_MOD_TAB_STRING))
            .icon(()->Moditems.flying_sword_blank.get().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
        pOutput.accept(Moditems.flying_sword_blank.get());
        pOutput.accept(Moditems.flying_sword_item.get());
        pOutput.accept(Moditems.spirit_stone.get());
    })
            .build());
}
