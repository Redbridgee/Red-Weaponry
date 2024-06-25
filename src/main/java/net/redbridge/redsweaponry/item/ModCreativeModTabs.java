package net.redbridge.redsweaponry.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redbridge.redsweaponry.RedsWeaponry;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RedsWeaponry.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WEAPONS_TAB = CREATIVE_MODE_TABS.register("weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.IRON_SWORD))
                    .title(Component.translatable("creativetab.weapons_tab"))
                    .displayItems((itemDisplayParameters, output) -> {


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
