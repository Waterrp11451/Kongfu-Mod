package net.waterrp11451.kongfumod.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.waterrp11451.kongfumod.KongfuMod;
import net.waterrp11451.kongfumod.client.entity.FlyingSwordEntityRenderer;
import net.waterrp11451.kongfumod.client.model.entity.FlyingSwordModel;
import net.waterrp11451.kongfumod.entity.ModEntityTypes;

@Mod.EventBusSubscriber(modid = KongfuMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
//Register renderer
        event.registerEntityRenderer(ModEntityTypes.FLYING_SWORD_ENTITY.get(), FlyingSwordEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
//Register layer
        event.registerLayerDefinition(FlyingSwordModel.LAYER_LOCATION, FlyingSwordModel::createBodyLayer);
    }
}
