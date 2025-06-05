package net.wendy.dustpunk.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wendy.dustpunk.Dustpunk;

public class ModBlockItemModelProvider extends ItemModelProvider {
    public ModBlockItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Dustpunk.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(("item/generated"))).texture("layer0",
                new ResourceLocation(Dustpunk.MOD_ID, "item/" + item.getId().getPath()));
    }
}
