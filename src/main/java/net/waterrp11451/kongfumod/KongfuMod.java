package net.waterrp11451.kongfumod;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.waterrp11451.kongfumod.entity.ModEntityTypes;
import org.slf4j.Logger;

import static net.waterrp11451.kongfumod.item.Moditems.register;
//The main class of the mod
@Mod(KongfuMod.MODID)
public class KongfuMod
{
    public static final String MODID ="kongfumod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public KongfuMod(IEventBus modEventBus)
    {
        modEventBus.addListener(this::commonSetup);
        ModEntityTypes.register(modEventBus);
        register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }


}
