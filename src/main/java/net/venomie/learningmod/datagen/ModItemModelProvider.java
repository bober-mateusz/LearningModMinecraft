package net.venomie.learningmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.venomie.learningmod.Item.ModItems;
import net.venomie.learningmod.LearningMod;
import net.venomie.learningmod.block.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LearningMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    simpleItem(ModItems.RUBY);
    simpleItem(ModItems.ZIRCON);
    SaplingItem(ModBlocks.EBONY_SAPLING);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LearningMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(LearningMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder SaplingItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LearningMod.MOD_ID,"block/" + item.getId().getPath()));
    }

}
