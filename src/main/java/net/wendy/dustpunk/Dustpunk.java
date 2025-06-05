package net.wendy.dustpunk;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.CreativeModeTabRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.wendy.dustpunk.block.PunkBlocks;
import net.wendy.dustpunk.item.ModCreativeModTabs;
import net.wendy.dustpunk.item.ModItems;
import org.slf4j.Logger;
import net.minecraft.world.item.BlockItem;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dustpunk.MOD_ID)
public class Dustpunk
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "dustpunk";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Dustpunk(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModTabs.register((modEventBus));
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.register((modEventBus));

        PunkBlocks.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {



        @SubscribeEvent
        public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
            BlockColors blockColors = event.getBlockColors();

            blockColors.register((state, world, pos, index) -> index == 0 ? 0x363636 : -1,
                    PunkBlocks.ANTHROSOL_SAND.get(), PunkBlocks.ANTHROSOL_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0x8A2C0D : -1,
                    PunkBlocks.FERRIC_SAND.get(), PunkBlocks.FERRIC_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0xDABC53 : -1,
                    PunkBlocks.LOESS_SAND.get(), PunkBlocks.LOESS_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0x422B08 : -1,
                    PunkBlocks.OCHRE_SAND.get(), PunkBlocks.OCHRE_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0x56327F : -1,
                    PunkBlocks.VOLCANIC_TEPHRA.get(), PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0xA3B98D : -1,
                    PunkBlocks.PHOSPHATIC_SAND.get(), PunkBlocks.PHOSPHATIC_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0x1E4F32 : -1,
                    PunkBlocks.GLAUCONITIC_SAND.get(), PunkBlocks.GLAUCONITIC_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0x8CA19F : -1,
                    PunkBlocks.CALCIC_SAND.get(), PunkBlocks.CALCIC_SANDSTONE.get());
            blockColors.register((state, world, pos, index) -> index == 0 ? 0x91D6C9 : -1,
                    PunkBlocks.DIATOMITE_SAND.get(), PunkBlocks.DIATOMITE_SANDSTONE.get());
        }

        @SubscribeEvent
        public static void registerItemColors(RegisterColorHandlersEvent.Item event) {

            BlockColors blockColors = event.getBlockColors();

            event.getItemColors().register(
                    (stack, index) -> blockColors.getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, index),
                    PunkBlocks.ANTHROSOL_SAND.get(),
                    PunkBlocks.FERRIC_SAND.get(),
                    PunkBlocks.LOESS_SAND.get(),
                    PunkBlocks.OCHRE_SAND.get(),
                    PunkBlocks.VOLCANIC_TEPHRA.get(),
                    PunkBlocks.PHOSPHATIC_SAND.get(),
                    PunkBlocks.GLAUCONITIC_SAND.get(),
                    PunkBlocks.CALCIC_SAND.get(),
                    PunkBlocks.DIATOMITE_SAND.get(),
                    PunkBlocks.ANTHROSOL_SANDSTONE.get(),
                    PunkBlocks.FERRIC_SANDSTONE.get(),
                    PunkBlocks.LOESS_SANDSTONE.get(),
                    PunkBlocks.OCHRE_SANDSTONE.get(),
                    PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get(),
                    PunkBlocks.PHOSPHATIC_SANDSTONE.get(),
                    PunkBlocks.GLAUCONITIC_SANDSTONE.get(),
                    PunkBlocks.CALCIC_SANDSTONE.get(),
                    PunkBlocks.DIATOMITE_SANDSTONE.get()
            );
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.ANTHROSOL_SAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.FERRIC_SAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.LOESS_SAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.OCHRE_SAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.VOLCANIC_TEPHRA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.PHOSPHATIC_SAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.GLAUCONITIC_SAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.CALCIC_SAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(PunkBlocks.DIATOMITE_SAND.get(), RenderType.cutout());
        }
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
