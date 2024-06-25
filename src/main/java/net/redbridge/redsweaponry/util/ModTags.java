package net.redbridge.redsweaponry.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.redbridge.redsweaponry.RedsWeaponry;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_RED_TOOL = tag("needs_red_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(RedsWeaponry.MOD_ID));
        }
    }

    public static class  Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(RedsWeaponry.MOD_ID));
        }
    }

}


