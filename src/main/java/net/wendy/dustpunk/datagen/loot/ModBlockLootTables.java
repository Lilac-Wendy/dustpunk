//EDIT THIS FILE WHEN ADDING NEW BLOCKS
package net.wendy.dustpunk.datagen.loot;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import net.wendy.dustpunk.block.PunkBlocks;
import org.jetbrains.annotations.NotNull;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import java.util.Random;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
       super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

    this.dropSelf(PunkBlocks.CALCIC_SAND.get());
    this.add(PunkBlocks.CALCIC_SAND.get(), LootTable.lootTable()
            .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(Items.BONE_MEAL).setWeight(5))
                    .add(LootItem.lootTableItem(Items.QUARTZ).setWeight(3))
                    .add(LootItem.lootTableItem(Items.SUGAR).setWeight(2))
                    .add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(3))
                    .add(LootItem.lootTableItem(Items.SAND).setWeight(2)))
            .withPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(PunkBlocks.CALCIC_SAND.get()))
                    .when(LootItemRandomChanceCondition.randomChance(0.5f)))
    );

    this.dropSelf(PunkBlocks.DIATOMITE_SAND.get());
    this.add(PunkBlocks.DIATOMITE_SAND.get(), LootTable.lootTable()
            .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(Items.KELP).setWeight(4))
                    .add(LootItem.lootTableItem(Items.SEAGRASS).setWeight(3))
                    .add(LootItem.lootTableItem(Items.BONE_MEAL).setWeight(3))
                    .add(LootItem.lootTableItem(Items.FISHING_ROD).setWeight(1))
                    .add(LootItem.lootTableItem(Items.PUFFERFISH).setWeight(1)))
            .withPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(PunkBlocks.DIATOMITE_SAND.get()))
                    .when(LootItemRandomChanceCondition.randomChance(0.5f)))
    );

        this.dropSelf(PunkBlocks.GLAUCONITIC_SAND.get());
this.add(PunkBlocks.GLAUCONITIC_SAND.get(), LootTable.lootTable()
            .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(Items.COPPER_INGOT).setWeight(3))
                    .add(LootItem.lootTableItem(Items.PRISMARINE_SHARD).setWeight(2))
                    .add(LootItem.lootTableItem(Items.LAPIS_LAZULI).setWeight(2))
                    .add(LootItem.lootTableItem(Items.SEAGRASS).setWeight(2))
                    .add(LootItem.lootTableItem(Items.KELP).setWeight(2)))
        .withPool(LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(PunkBlocks.GLAUCONITIC_SAND.get()))
                .when(LootItemRandomChanceCondition.randomChance(0.5f))
                )
    );


    this.dropSelf(PunkBlocks.PHOSPHATIC_SAND.get());
    this.add(PunkBlocks.PHOSPHATIC_SAND.get(), LootTable.lootTable()
            .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(Items.BONE_MEAL).setWeight(5))
                    .add(LootItem.lootTableItem(Items.BONE).setWeight(3))
                    .add(LootItem.lootTableItem(Items.LAPIS_LAZULI).setWeight(2))
                    .add(LootItem.lootTableItem(Items.BLUE_DYE).setWeight(1)))
            .withPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(PunkBlocks.PHOSPHATIC_SAND.get()))
                        .when(LootItemRandomChanceCondition.randomChance(0.5f))
                )

    );

    this.dropSelf(PunkBlocks.ANTHROSOL_SAND.get());
    this.add(PunkBlocks.ANTHROSOL_SAND.get(), LootTable.lootTable()
            .withPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    // Organic Thrash/Loot
                    .add(LootItem.lootTableItem(Items.BONE_MEAL).setWeight(5))
                    .add(LootItem.lootTableItem(Items.STICK).setWeight(4))
                    .add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(3))
                    .add(LootItem.lootTableItem(Items.BONE).setWeight(2))
                    .add(LootItem.lootTableItem(Items.DIRT).setWeight(2))
                    // Food
                    .add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(3))
                    .add(LootItem.lootTableItem(Items.APPLE).setWeight(1))
                    .add(LootItem.lootTableItem(Items.BREAD).setWeight(1))
                    .add(LootItem.lootTableItem(Items.BEETROOT).setWeight(1))
                    .add(LootItem.lootTableItem(Items.CARROT).setWeight(1))
                    .add(LootItem.lootTableItem(Items.POTATO).setWeight(1))
                    //Saplings
                    .add(LootItem.lootTableItem(Items.OAK_SAPLING).setWeight(1))
                    .add(LootItem.lootTableItem(Items.BIRCH_SAPLING).setWeight(1))
                    .add(LootItem.lootTableItem(Items.SPRUCE_SAPLING).setWeight(1))
                    .add(LootItem.lootTableItem(Items.JUNGLE_SAPLING).setWeight(1))
                    .add(LootItem.lootTableItem(Items.ACACIA_SAPLING).setWeight(1))
                    .add(LootItem.lootTableItem(Items.DARK_OAK_SAPLING).setWeight(1))
                    //Wood
                    .add(LootItem.lootTableItem(Items.OAK_LOG).setWeight(1))
                    .add(LootItem.lootTableItem(Items.BIRCH_LOG).setWeight(1))
                    .add(LootItem.lootTableItem(Items.SPRUCE_LOG).setWeight(1))
                    .add(LootItem.lootTableItem(Items.JUNGLE_LOG).setWeight(1))
                    .add(LootItem.lootTableItem(Items.ACACIA_LOG).setWeight(1))
                    .add(LootItem.lootTableItem(Items.DARK_OAK_LOG).setWeight(1))
                )
            .withPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(PunkBlocks.ANTHROSOL_SAND.get()))
                    .when(LootItemRandomChanceCondition.randomChance(0.5f))
            )
    );

    this.dropSelf(PunkBlocks.FERRIC_SAND.get());
    this.add(PunkBlocks.FERRIC_SAND.get(), LootTable.lootTable()
            .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.IRON_NUGGET).setWeight(5))
                        .add(LootItem.lootTableItem(Items.FLINT).setWeight(3))
                        .add(LootItem.lootTableItem(Items.CLAY_BALL).setWeight(2))
                    )
            .withPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(PunkBlocks.FERRIC_SAND.get()))
                    .when(LootItemRandomChanceCondition.randomChance(0.5f))
    ));

        this.dropSelf(PunkBlocks.LOESS_SAND.get());
        this.add(PunkBlocks.LOESS_SAND.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.GRAVEL).setWeight(4))
                        .add(LootItem.lootTableItem(Items.FLINT).setWeight(2))
                        .add(LootItem.lootTableItem(Items.COAL).setWeight(1))
                        .add(LootItem.lootTableItem(Items.IRON_NUGGET).setWeight(1))
                )
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(PunkBlocks.LOESS_SAND.get()))
                                .when(LootItemRandomChanceCondition.randomChance(0.5f))
                ));


        this.dropSelf(PunkBlocks.OCHRE_SAND.get());
        this.add(PunkBlocks.OCHRE_SAND.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.RED_TERRACOTTA).setWeight(1))
                        .add(LootItem.lootTableItem(Items.RAW_IRON).setWeight(1))
                        .add(LootItem.lootTableItem(Items.CLAY_BALL).setWeight(1))
                )
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.OCHRE_SAND.get()))
                        .when(LootItemRandomChanceCondition.randomChance(0.4f))
                ));

        this.dropSelf(PunkBlocks.VOLCANIC_TEPHRA.get());
        this.add(PunkBlocks.VOLCANIC_TEPHRA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.BASALT).setWeight(4))
                        .add(LootItem.lootTableItem(Items.NETHERRACK).setWeight(3))
                        .add(LootItem.lootTableItem(Items.MAGMA_CREAM).setWeight(1))
                        .add(LootItem.lootTableItem(Items.COAL).setWeight(2))
                        .add(LootItem.lootTableItem(Items.BLAZE_POWDER).setWeight(1))
                        .add(LootItem.lootTableItem(Items.GUNPOWDER).setWeight(2))
                )
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.VOLCANIC_TEPHRA.get()))
                        .when(LootItemRandomChanceCondition.randomChance(0.4f))
                )
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.OBSIDIAN))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f)))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.GOLD_NUGGET))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f)))

                );
        this.dropSelf(PunkBlocks.ANTHROSOL_SANDSTONE.get());
        this.add(PunkBlocks.ANTHROSOL_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.BONE_BLOCK).setWeight(2))
                        .add(LootItem.lootTableItem(Items.HAY_BLOCK).setWeight(1))
                        .add(LootItem.lootTableItem(Items.DIRT_PATH).setWeight(2))
                        .add(LootItem.lootTableItem(Items.COARSE_DIRT).setWeight(2))
                        .add(LootItem.lootTableItem(Items.APPLE).setWeight(2))
                        .add(LootItem.lootTableItem(Items.BREAD).setWeight(2))
                        .add(LootItem.lootTableItem(Items.OAK_LOG).setWeight(1))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.ANTHROSOL_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.ANTHROSOL_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.FERRIC_SANDSTONE.get());
        this.add(PunkBlocks.FERRIC_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.IRON_INGOT).setWeight(2))
                        .add(LootItem.lootTableItem(Items.FLINT).setWeight(2))
                        .add(LootItem.lootTableItem(Items.REDSTONE).setWeight(1))
                        .add(LootItem.lootTableItem(Items.CLAY).setWeight(1))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.FERRIC_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.FERRIC_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.OCHRE_SANDSTONE.get());
        this.add(PunkBlocks.OCHRE_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.YELLOW_DYE).setWeight(2))
                        .add(LootItem.lootTableItem(Items.HONEYCOMB).setWeight(1))
                        .add(LootItem.lootTableItem(Items.SUNFLOWER).setWeight(1))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.OCHRE_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.OCHRE_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.LOESS_SANDSTONE.get());
        this.add(PunkBlocks.LOESS_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.COARSE_DIRT).setWeight(2))
                        .add(LootItem.lootTableItem(Items.GRAVEL).setWeight(2))
                        .add(LootItem.lootTableItem(Items.COAL).setWeight(1))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.LOESS_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.LOESS_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get());
        this.add(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.MAGMA_CREAM).setWeight(2))
                        .add(LootItem.lootTableItem(Items.BLAZE_POWDER).setWeight(1))
                        .add(LootItem.lootTableItem(Items.BASALT).setWeight(2))
                        .add(LootItem.lootTableItem(Items.NETHERRACK).setWeight(2))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.VOLCANIC_TEPHRA.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.VOLCANIC_TEPHRA_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.GLAUCONITIC_SANDSTONE.get());
        this.add(PunkBlocks.GLAUCONITIC_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.COPPER_BLOCK).setWeight(1))
                        .add(LootItem.lootTableItem(Items.PRISMARINE_CRYSTALS).setWeight(2))
                        .add(LootItem.lootTableItem(Items.LAPIS_BLOCK).setWeight(1))
                        .add(LootItem.lootTableItem(Items.SEA_PICKLE).setWeight(1))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.GLAUCONITIC_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.GLAUCONITIC_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.CALCIC_SANDSTONE.get());
        this.add(PunkBlocks.CALCIC_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.BONE_BLOCK).setWeight(1))
                        .add(LootItem.lootTableItem(Items.SUGAR).setWeight(2))
                        .add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(1))
                        .add(LootItem.lootTableItem(Items.QUARTZ_BLOCK).setWeight(1))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.CALCIC_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.CALCIC_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.DIATOMITE_SANDSTONE.get());
        this.add(PunkBlocks.DIATOMITE_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.SEAGRASS).setWeight(3))
                        .add(LootItem.lootTableItem(Items.KELP).setWeight(2))
                        .add(LootItem.lootTableItem(Items.COD).setWeight(1))
                        .add(LootItem.lootTableItem(Items.SALMON).setWeight(1))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.DIATOMITE_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.DIATOMITE_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

        this.dropSelf(PunkBlocks.PHOSPHATIC_SANDSTONE.get());
        this.add(PunkBlocks.PHOSPHATIC_SANDSTONE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.MAGMA_CREAM).setWeight(2))
                        .add(LootItem.lootTableItem(Items.BLAZE_POWDER).setWeight(1))
                        .add(LootItem.lootTableItem(Items.BASALT).setWeight(2))
                        .add(LootItem.lootTableItem(Items.NETHERRACK).setWeight(2))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(PunkBlocks.PHOSPHATIC_SAND.get()).setWeight(1))
                        .add(LootItem.lootTableItem(PunkBlocks.PHOSPHATIC_SANDSTONE.get()).setWeight(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.6f))
                )
        );

    }



    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return PunkBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}