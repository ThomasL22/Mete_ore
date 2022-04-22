package fr.tl.fm.item;

import fr.tl.fm.FM;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FM.MOD_ID);

    public static final RegistryObject<Item> METEOR_FRAGMENT = ITEMS.register("meteor_fragment", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> METEOR = ITEMS.register("meteor", () -> new Item(new Item.Properties().stacksTo(16).tab(ItemGroup.TAB_MATERIALS)));
}