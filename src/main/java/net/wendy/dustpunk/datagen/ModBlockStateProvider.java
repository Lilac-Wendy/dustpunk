package net.wendy.dustpunk.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wendy.dustpunk.Dustpunk;
import net.wendy.dustpunk.block.PunkBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Dustpunk.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        tintedSandLikeBlock(PunkBlocks.ANTHROSOL_SAND);
        tintedSandLikeBlock(PunkBlocks.FERRIC_SAND);
        tintedSandLikeBlock(PunkBlocks.LOESS_SAND);
        tintedSandLikeBlock(PunkBlocks.OCHRE_SAND);
        tintedSandLikeBlock(PunkBlocks.VOLCANIC_TEPHRA);
        tintedSandLikeBlock(PunkBlocks.PHOSPHATIC_SAND);
        tintedSandLikeBlock(PunkBlocks.GLAUCONITIC_SAND);
        tintedSandLikeBlock(PunkBlocks.CALCIC_SAND);
        tintedSandLikeBlock(PunkBlocks.DIATOMITE_SAND);

        tintedSandstoneBlock(PunkBlocks.ANTHROSOL_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.FERRIC_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.LOESS_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.OCHRE_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.PHOSPHATIC_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.GLAUCONITIC_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.CALCIC_SANDSTONE);
        tintedSandstoneBlock(PunkBlocks.DIATOMITE_SANDSTONE);
    }

    private void tintedSandstoneBlock(RegistryObject<Block> block) {
        String blockName = block.getId().getPath();

        BlockModelBuilder model = models().withExistingParent(blockName, "block/block")
                .texture("top", "minecraft:block/sandstone_top") // Texture for the top face
                .texture("side", "minecraft:block/sandstone")    // Texture for the side faces
                .texture("bottom", "minecraft:block/sandstone_bottom")  // Texture for the bottom face
                .texture("particle", "minecraft:block/sandstone"); // Particle texture, typically one of the main textures

        model.element()
                .from(0, 0, 0).to(16, 16, 16)
                .face(Direction.UP).texture("#top").tintindex(0).end()     // Top face uses 'top' texture
                .face(Direction.DOWN).texture("#bottom").tintindex(0).end()  // Bottom face uses 'bottom' texture
                .face(Direction.NORTH).texture("#side").tintindex(0).end()  // North face uses 'side' texture
                .face(Direction.SOUTH).texture("#side").tintindex(0).end()  // South face uses 'side' texture
                .face(Direction.EAST).texture("#side").tintindex(0).end()   // East face uses 'side' texture
                .face(Direction.WEST).texture("#side").tintindex(0).end()    // West face uses 'side' texture
                .end();

        simpleBlock(block.get(), model);
        simpleBlockItem(block.get(), model);

        itemModels().getBuilder(block.getId().getPath())
                .parent(model);
    }


    private void tintedSandLikeBlock(RegistryObject<Block> block) {
        String blockName = block.getId().getPath();

        BlockModelBuilder model = models().withExistingParent(blockName, "block/block")
                .texture("layer0", "minecraft:block/sand")
                .texture("particle", "minecraft:block/sand")
                .renderType("cutout");


        model.element()
                .from(0, 0, 0).to(16, 16, 16)
                .allFaces((dir, face) -> face.texture("#layer0").tintindex(0))
                .end();

        simpleBlock(block.get(), model);
        simpleBlockItem(block.get(), model);
    }
}
