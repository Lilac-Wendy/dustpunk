//EDIT THIS FILE WHEN ADDING NEW BLOCKS
package net.wendy.dustpunk.datagen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.wendy.dustpunk.Dustpunk;
import net.wendy.dustpunk.block.PunkBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Dustpunk.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.SAND)
                .add(PunkBlocks.FERRIC_SAND.get())
                .add(PunkBlocks.LOESS_SAND.get())
                .add(PunkBlocks.ANTHROSOL_SAND.get())
                .add(PunkBlocks.OCHRE_SAND.get())
                .add(PunkBlocks.VOLCANIC_TEPHRA.get())
                .add(PunkBlocks.PHOSPHATIC_SAND.get())
                .add(PunkBlocks.GLAUCONITIC_SAND.get())
                .add(PunkBlocks.CALCIC_SAND.get())
                .add(PunkBlocks.DIATOMITE_SAND.get())
                .add(PunkBlocks.FERRIC_SANDSTONE.get())
                .add(PunkBlocks.LOESS_SANDSTONE.get())
                .add(PunkBlocks.ANTHROSOL_SANDSTONE.get())
                .add(PunkBlocks.OCHRE_SANDSTONE.get())
                .add(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get())
                .add(PunkBlocks.PHOSPHATIC_SANDSTONE.get())
                .add(PunkBlocks.GLAUCONITIC_SANDSTONE.get())
                .add(PunkBlocks.CALCIC_SANDSTONE.get())
                .add(PunkBlocks.DIATOMITE_SANDSTONE.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(PunkBlocks.FERRIC_SAND.get())
                .add(PunkBlocks.LOESS_SAND.get())
                .add(PunkBlocks.ANTHROSOL_SAND.get())
                .add(PunkBlocks.OCHRE_SAND.get())
                .add(PunkBlocks.VOLCANIC_TEPHRA.get())
                .add(PunkBlocks.PHOSPHATIC_SAND.get())
                .add(PunkBlocks.GLAUCONITIC_SAND.get())
                .add(PunkBlocks.CALCIC_SAND.get())
                .add(PunkBlocks.DIATOMITE_SAND.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(PunkBlocks.FERRIC_SANDSTONE.get())
                .add(PunkBlocks.LOESS_SANDSTONE.get())
                .add(PunkBlocks.ANTHROSOL_SANDSTONE.get())
                .add(PunkBlocks.OCHRE_SANDSTONE.get())
                .add(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get())
                .add(PunkBlocks.PHOSPHATIC_SANDSTONE.get())
                .add(PunkBlocks.GLAUCONITIC_SANDSTONE.get())
                .add(PunkBlocks.CALCIC_SANDSTONE.get())
                .add(PunkBlocks.DIATOMITE_SANDSTONE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(PunkBlocks.LOESS_SAND.get())
                .add(PunkBlocks.FERRIC_SAND.get())
                .add(PunkBlocks.LOESS_SANDSTONE.get())
                .add(PunkBlocks.FERRIC_SANDSTONE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(PunkBlocks.OCHRE_SAND.get())
                .add(PunkBlocks.VOLCANIC_TEPHRA.get())
                .add(PunkBlocks.OCHRE_SANDSTONE.get())
                .add(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get());
    }}
