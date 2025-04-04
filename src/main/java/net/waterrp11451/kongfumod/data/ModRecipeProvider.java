package net.waterrp11451.kongfumod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.waterrp11451.kongfumod.item.Moditems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    //https://docs.neoforged.net/docs/datagen/server/recipes
    public ModRecipeProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pPackOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // 有序合成
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.flying_sword_item.get())
                .pattern("aaa")
                .pattern(" aba ")
                .pattern(" aaa ")
                .define('a', Moditems.spirit_stone.get())
                .define('b', Moditems.flying_sword_blank.get())
                .unlockedBy("has_spirit_stone",has(Moditems.spirit_stone.get()))
                .save(pRecipeOutput);

    }
}
