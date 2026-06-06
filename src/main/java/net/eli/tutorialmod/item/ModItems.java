package net.eli.tutorialmod.item;

import net.eli.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SLICED_CAKE = ITEMS.register("sliced_cake",
            () -> new Item(new Item
                    .Properties()
                    .food(ModFoodProperties.SLICED_CAKE)));

    public static final RegistryObject<Item> SOUL = ITEMS.register("soul",
            () -> new Item(new Item
                    .Properties()
                    .food(ModFoodProperties.SOUL)));

    public static final RegistryObject<Item> ENERGY_DRINK = ITEMS.register("energy_drink",
    () -> new Item(new Item
            .Properties()
            .food(ModFoodProperties.ENERGY_DRINK)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
