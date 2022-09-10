package teaso.wiki.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import teaso.wiki.block.equipment.*;
import teaso.wiki.block.floor.*;
import teaso.wiki.block.floor.floor_1.*;
import teaso.wiki.block.floor.floor_2.*;
import teaso.wiki.block.floor.floor_3.*;
import teaso.wiki.block.floor.floor_5.*;
import teaso.wiki.block.floor.floor_6.*;
import teaso.wiki.block.floor.floor_7.*;
import teaso.wiki.block.icon.cap.*;
import teaso.wiki.block.icon.*;
import teaso.wiki.block.icon.xust.*;
import teaso.wiki.block.stair.*;
import teaso.wiki.block.wall.*;

@Mod.EventBusSubscriber
public class BlockLoader {
    public static Block WALL_1 = new wall_1();
    public static Block WALL_2 = new wall_2();
    public static Block WALL_3 = new wall_3();

    public static Block FLOOR_1_1 = new floor_1_1();
    public static Block FLOOR_1_2 = new floor_1_2();
    public static Block FLOOR_2_1 = new floor_2_1();
    public static Block FLOOR_2_2 = new floor_2_2();
    public static Block FLOOR_2_3 = new floor_2_3();
    public static Block FLOOR_2_4 = new floor_2_4();
    public static Block FLOOR_2_5 = new floor_2_5();
    public static Block FLOOR_2_6 = new floor_2_6();
    public static Block FLOOR_2_7 = new floor_2_7();
    public static Block FLOOR_2_8 = new floor_2_8();
    public static Block FLOOR_2_9 = new floor_2_9();
    public static Block FLOOR_2_10 = new floor_2_10();
    public static Block FLOOR_2_11 = new floor_2_11();
    public static Block FLOOR_2_12 = new floor_2_12();
    public static Block FLOOR_3_1 = new floor_3_1();
    public static Block FLOOR_3_2 = new floor_3_2();
    public static Block FLOOR_3_3 = new floor_3_3();
    public static Block FLOOR_4 = new floor_4();
    public static Block FLOOR_5_1 = new floor_5_1();
    public static Block FLOOR_5_2 = new floor_5_2();
    public static Block FLOOR_6_1 = new floor_6_1();
    public static Block FLOOR_6_2 = new floor_6_2();
    public static Block FLOOR_7_1 = new floor_7_1();
    public static Block FLOOR_7_2 = new floor_7_2();
    public static Block FLOOR_7_3 = new floor_7_3();

    public static Block STAIR_1 = new stair_1();

    public static Block CAP_1 = new cap_1();
    public static Block CAP_2 = new cap_2();
    public static Block CAP_3 = new cap_3();
    public static Block CAP_4 = new cap_4();
    public static Block CAP_5 = new cap_5();

    public static Block XUST_0 = new xust_0();

    public static Block ICON_1 = new icon_1();
    public static Block ICON_2 = new icon_2();
    public static Block ICON_3 = new icon_3();
    public static Block ICON_4 = new icon_4();
    public static Block ICON_5 = new icon_5();
    public static Block ICON_6 = new icon_6();
    public static Block ICON_7 = new icon_7();
    public static Block ICON_8 = new icon_8();
    public static Block ICON_9 = new icon_9();

    public static Block EQUIPMENT_1 = new equipment_1();

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        event.getRegistry().register(WALL_1.setRegistryName("loadmodel:wall_1"));
        event.getRegistry().register(WALL_2.setRegistryName("loadmodel:wall_2"));
        event.getRegistry().register(WALL_3.setRegistryName("loadmodel:wall_3"));

        event.getRegistry().register(FLOOR_1_1.setRegistryName("loadmodel:floor_1_1"));
        event.getRegistry().register(FLOOR_1_2.setRegistryName("loadmodel:floor_1_2"));
        event.getRegistry().register(FLOOR_2_1.setRegistryName("loadmodel:floor_2_1"));
        event.getRegistry().register(FLOOR_2_2.setRegistryName("loadmodel:floor_2_2"));
        event.getRegistry().register(FLOOR_2_3.setRegistryName("loadmodel:floor_2_3"));
        event.getRegistry().register(FLOOR_2_4.setRegistryName("loadmodel:floor_2_4"));
        event.getRegistry().register(FLOOR_2_5.setRegistryName("loadmodel:floor_2_5"));
        event.getRegistry().register(FLOOR_2_6.setRegistryName("loadmodel:floor_2_6"));
        event.getRegistry().register(FLOOR_2_7.setRegistryName("loadmodel:floor_2_7"));
        event.getRegistry().register(FLOOR_2_8.setRegistryName("loadmodel:floor_2_8"));
        event.getRegistry().register(FLOOR_2_9.setRegistryName("loadmodel:floor_2_9"));
        event.getRegistry().register(FLOOR_2_10.setRegistryName("loadmodel:floor_2_10"));
        event.getRegistry().register(FLOOR_2_11.setRegistryName("loadmodel:floor_2_11"));
        event.getRegistry().register(FLOOR_2_12.setRegistryName("loadmodel:floor_2_12"));
        event.getRegistry().register(FLOOR_3_1.setRegistryName("loadmodel:floor_3_1"));
        event.getRegistry().register(FLOOR_3_2.setRegistryName("loadmodel:floor_3_2"));
        event.getRegistry().register(FLOOR_3_3.setRegistryName("loadmodel:floor_3_3"));
        event.getRegistry().register(FLOOR_4.setRegistryName("loadmodel:floor_4"));
        event.getRegistry().register(FLOOR_5_1.setRegistryName("loadmodel:floor_5_1"));
        event.getRegistry().register(FLOOR_5_2.setRegistryName("loadmodel:floor_5_2"));
        event.getRegistry().register(FLOOR_6_1.setRegistryName("loadmodel:floor_6_1"));
        event.getRegistry().register(FLOOR_6_2.setRegistryName("loadmodel:floor_6_2"));
        event.getRegistry().register(FLOOR_7_1.setRegistryName("loadmodel:floor_7_1"));
        event.getRegistry().register(FLOOR_7_2.setRegistryName("loadmodel:floor_7_2"));
        event.getRegistry().register(FLOOR_7_3.setRegistryName("loadmodel:floor_7_3"));

        event.getRegistry().register(STAIR_1.setRegistryName("loadmodel:stair_1"));

        event.getRegistry().register(CAP_1.setRegistryName("loadmodel:cap_1"));
        event.getRegistry().register(CAP_2.setRegistryName("loadmodel:cap_2"));
        event.getRegistry().register(CAP_3.setRegistryName("loadmodel:cap_3"));
        event.getRegistry().register(CAP_4.setRegistryName("loadmodel:cap_4"));
        event.getRegistry().register(CAP_5.setRegistryName("loadmodel:cap_5"));

        event.getRegistry().register(XUST_0.setRegistryName("loadmodel:xust_0"));

        event.getRegistry().register(ICON_1.setRegistryName("loadmodel:icon_1"));
        event.getRegistry().register(ICON_2.setRegistryName("loadmodel:icon_2"));
        event.getRegistry().register(ICON_3.setRegistryName("loadmodel:icon_3"));
        event.getRegistry().register(ICON_4.setRegistryName("loadmodel:icon_4"));
        event.getRegistry().register(ICON_5.setRegistryName("loadmodel:icon_5"));
        event.getRegistry().register(ICON_6.setRegistryName("loadmodel:icon_6"));
        event.getRegistry().register(ICON_7.setRegistryName("loadmodel:icon_7"));
        event.getRegistry().register(ICON_8.setRegistryName("loadmodel:icon_8"));
        event.getRegistry().register(ICON_9.setRegistryName("loadmodel:icon_9"));

        event.getRegistry().register(EQUIPMENT_1.setRegistryName("loadmodel:equipment_1"));

    }

    @SubscribeEvent
    public static void registerItemBlockModel(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_1),0,new ModelResourceLocation(WALL_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_2),0,new ModelResourceLocation(WALL_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_3),0,new ModelResourceLocation(WALL_3.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_1_1),0,new ModelResourceLocation(FLOOR_1_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_1_2),0,new ModelResourceLocation(FLOOR_1_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_1),0,new ModelResourceLocation(FLOOR_2_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_2),0,new ModelResourceLocation(FLOOR_2_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_3),0,new ModelResourceLocation(FLOOR_2_3.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_4),0,new ModelResourceLocation(FLOOR_2_4.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_5),0,new ModelResourceLocation(FLOOR_2_5.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_6),0,new ModelResourceLocation(FLOOR_2_6.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_7),0,new ModelResourceLocation(FLOOR_2_7.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_8),0,new ModelResourceLocation(FLOOR_2_8.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_9),0,new ModelResourceLocation(FLOOR_2_9.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_10),0,new ModelResourceLocation(FLOOR_2_10.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_11),0,new ModelResourceLocation(FLOOR_2_11.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_12),0,new ModelResourceLocation(FLOOR_2_12.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_3_1),0,new ModelResourceLocation(FLOOR_3_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_3_2),0,new ModelResourceLocation(FLOOR_3_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_3_3),0,new ModelResourceLocation(FLOOR_3_3.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_4),0,new ModelResourceLocation(FLOOR_4.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_5_1),0,new ModelResourceLocation(FLOOR_5_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_5_2),0,new ModelResourceLocation(FLOOR_5_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_6_1),0,new ModelResourceLocation(FLOOR_6_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_6_2),0,new ModelResourceLocation(FLOOR_6_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_7_1),0,new ModelResourceLocation(FLOOR_7_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_7_2),0,new ModelResourceLocation(FLOOR_7_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_7_3),0,new ModelResourceLocation(FLOOR_7_3.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STAIR_1),0,new ModelResourceLocation(STAIR_1.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CAP_1),0,new ModelResourceLocation(CAP_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CAP_2),0,new ModelResourceLocation(CAP_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CAP_3),0,new ModelResourceLocation(CAP_3.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CAP_4),0,new ModelResourceLocation(CAP_4.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CAP_5),0,new ModelResourceLocation(CAP_5.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(XUST_0),0,new ModelResourceLocation(XUST_0.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_1),0,new ModelResourceLocation(ICON_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_2),0,new ModelResourceLocation(ICON_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_3),0,new ModelResourceLocation(ICON_3.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_4),0,new ModelResourceLocation(ICON_4.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_5),0,new ModelResourceLocation(ICON_5.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_6),0,new ModelResourceLocation(ICON_6.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_7),0,new ModelResourceLocation(ICON_7.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_8),0,new ModelResourceLocation(ICON_8.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ICON_9),0,new ModelResourceLocation(ICON_9.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(EQUIPMENT_1),0,new ModelResourceLocation(EQUIPMENT_1.getRegistryName(),"inventory"));

    }
}
