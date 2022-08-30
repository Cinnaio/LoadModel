package teaso.wiki.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import teaso.wiki.block.floor.*;
import teaso.wiki.block.floor.floor_1.*;
import teaso.wiki.block.floor.floor_2.*;
import teaso.wiki.block.floor.floor_3.*;
import teaso.wiki.block.floor.floor_5.*;
import teaso.wiki.block.stair.stair_1;
import teaso.wiki.block.wall.wall_1;

@Mod.EventBusSubscriber
public class BlockLoader {
    public static Block WALL_1 = new wall_1();

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

    public static Block STAIR_1 = new stair_1();

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        event.getRegistry().register(WALL_1.setRegistryName("loadmodel:wall_1"));

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

        event.getRegistry().register(STAIR_1.setRegistryName("loadmodel:stair_1"));
    }

    @SubscribeEvent
    public static void registerItemBlockModel(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_1),0,new ModelResourceLocation(WALL_1.getRegistryName(),"inventory"));

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

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STAIR_1),0,new ModelResourceLocation(STAIR_1.getRegistryName(),"inventory"));
    }
}
