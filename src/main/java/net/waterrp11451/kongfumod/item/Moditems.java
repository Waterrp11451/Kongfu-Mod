package net.waterrp11451.kongfumod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.waterrp11451.kongfumod.KongfuMod;
import net.waterrp11451.kongfumod.item.custom.flying_sword_blank;
import net.waterrp11451.kongfumod.item.custom.spirit_stone;

import java.util.function.Supplier;

import static net.waterrp11451.kongfumod.item.ModCreativeTab.CREATIVE_MODE_TABS;
//Register items
public class Moditems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, KongfuMod.MODID);

    public static final Supplier<Item> flying_sword_blank = ITEMS.register("flying_sword_blank",() -> new flying_sword_blank(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> spirit_stone = ITEMS.register("spirit_stone",() -> new spirit_stone(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> flying_sword_item = ITEMS.register("flying_sword_item", net.waterrp11451.kongfumod.item.custom.flying_sword_item::new);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);
    }

}