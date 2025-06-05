//EDIT THIS FILE WHEN ADDING NEW BLOCKS
package net.wendy.dustpunk.item;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wendy.dustpunk.Dustpunk;
import net.wendy.dustpunk.block.PunkBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dustpunk.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DUSTPUNK_TAB = CREATIVE_MODE_TABS.register("dustpunk_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PunkBlocks.ANTHROSOL_SAND.get()))
                    .title(Component.translatable("creativetab.dustpunk_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(PunkBlocks.ANTHROSOL_SAND.get());
                        output.accept(PunkBlocks.ANTHROSOL_SANDSTONE.get());
                        output.accept(PunkBlocks.FERRIC_SAND.get());
                        output.accept(PunkBlocks.FERRIC_SANDSTONE.get());
                        output.accept(PunkBlocks.LOESS_SAND.get());
                        output.accept(PunkBlocks.LOESS_SANDSTONE.get());
                        output.accept(PunkBlocks.OCHRE_SAND.get());
                        output.accept(PunkBlocks.OCHRE_SANDSTONE.get());
                        output.accept(PunkBlocks.VOLCANIC_TEPHRA.get());
                        output.accept(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get());
                        output.accept(PunkBlocks.PHOSPHATIC_SAND.get());
                        output.accept(PunkBlocks.PHOSPHATIC_SANDSTONE.get());
                        output.accept(PunkBlocks.GLAUCONITIC_SAND.get());
                        output.accept(PunkBlocks.GLAUCONITIC_SANDSTONE.get());
                        output.accept(PunkBlocks.DIATOMITE_SAND.get());
                        output.accept(PunkBlocks.DIATOMITE_SANDSTONE.get());
                        output.accept(PunkBlocks.CALCIC_SAND.get());
                        output.accept(PunkBlocks.CALCIC_SANDSTONE.get());
                        output.accept(Items.SAND);

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
