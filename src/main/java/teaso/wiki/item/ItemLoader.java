package teaso.wiki.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static teaso.wiki.block.BlockLoader.*;


@Mod.EventBusSubscriber
public class ItemLoader {
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new ItemBlock(WALL_1).setRegistryName("loadmodel:wall_1"));
        event.getRegistry().register(new ItemBlock(WALL_2).setRegistryName("loadmodel:wall_2"));
        event.getRegistry().register(new ItemBlock(WALL_3).setRegistryName("loadmodel:wall_3"));

        event.getRegistry().register(new ItemBlock(FLOOR_1_1).setRegistryName("loadmodel:floor_1_1"));
        event.getRegistry().register(new ItemBlock(FLOOR_1_2).setRegistryName("loadmodel:floor_1_2"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_1).setRegistryName("loadmodel:floor_2_1"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_2).setRegistryName("loadmodel:floor_2_2"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_3).setRegistryName("loadmodel:floor_2_3"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_4).setRegistryName("loadmodel:floor_2_4"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_5).setRegistryName("loadmodel:floor_2_5"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_6).setRegistryName("loadmodel:floor_2_6"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_7).setRegistryName("loadmodel:floor_2_7"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_8).setRegistryName("loadmodel:floor_2_8"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_9).setRegistryName("loadmodel:floor_2_9"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_10).setRegistryName("loadmodel:floor_2_10"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_11).setRegistryName("loadmodel:floor_2_11"));
        event.getRegistry().register(new ItemBlock(FLOOR_2_12).setRegistryName("loadmodel:floor_2_12"));
        event.getRegistry().register(new ItemBlock(FLOOR_3_1).setRegistryName("loadmodel:floor_3_1"));
        event.getRegistry().register(new ItemBlock(FLOOR_3_2).setRegistryName("loadmodel:floor_3_2"));
        event.getRegistry().register(new ItemBlock(FLOOR_3_3).setRegistryName("loadmodel:floor_3_3"));
        event.getRegistry().register(new ItemBlock(FLOOR_4).setRegistryName("loadmodel:floor_4"));
        event.getRegistry().register(new ItemBlock(FLOOR_5_1).setRegistryName("loadmodel:floor_5_1"));
        event.getRegistry().register(new ItemBlock(FLOOR_5_2).setRegistryName("loadmodel:floor_5_2"));
        event.getRegistry().register(new ItemBlock(FLOOR_6_1).setRegistryName("loadmodel:floor_6_1"));
        event.getRegistry().register(new ItemBlock(FLOOR_6_2).setRegistryName("loadmodel:floor_6_2"));
        event.getRegistry().register(new ItemBlock(FLOOR_7_1).setRegistryName("loadmodel:floor_7_1"));
        event.getRegistry().register(new ItemBlock(FLOOR_7_2).setRegistryName("loadmodel:floor_7_2"));
        event.getRegistry().register(new ItemBlock(FLOOR_7_3).setRegistryName("loadmodel:floor_7_3"));

        event.getRegistry().register(new ItemBlock(STAIR_1).setRegistryName("loadmodel:stair_1"));

        event.getRegistry().register(new ItemBlock(CAP_1).setRegistryName("loadmodel:cap_1"));
        event.getRegistry().register(new ItemBlock(CAP_2).setRegistryName("loadmodel:cap_2"));
        event.getRegistry().register(new ItemBlock(CAP_3).setRegistryName("loadmodel:cap_3"));
        event.getRegistry().register(new ItemBlock(CAP_4).setRegistryName("loadmodel:cap_4"));
        event.getRegistry().register(new ItemBlock(CAP_5).setRegistryName("loadmodel:cap_5"));

        event.getRegistry().register(new ItemBlock(XUST_0).setRegistryName("loadmodel:xust_0"));

        event.getRegistry().register(new ItemBlock(ICON_1).setRegistryName("loadmodel:icon_1"));
        event.getRegistry().register(new ItemBlock(ICON_2).setRegistryName("loadmodel:icon_2"));
        event.getRegistry().register(new ItemBlock(ICON_3).setRegistryName("loadmodel:icon_3"));
        event.getRegistry().register(new ItemBlock(ICON_4).setRegistryName("loadmodel:icon_4"));
        event.getRegistry().register(new ItemBlock(ICON_5).setRegistryName("loadmodel:icon_5"));
        event.getRegistry().register(new ItemBlock(ICON_6).setRegistryName("loadmodel:icon_6"));
        event.getRegistry().register(new ItemBlock(ICON_7).setRegistryName("loadmodel:icon_7"));
        event.getRegistry().register(new ItemBlock(ICON_8).setRegistryName("loadmodel:icon_8"));
        event.getRegistry().register(new ItemBlock(ICON_9).setRegistryName("loadmodel:icon_9"));

        event.getRegistry().register(new ItemBlock(EQUIPMENT_1).setRegistryName("loadmodel:equipment_1"));

    }
}

