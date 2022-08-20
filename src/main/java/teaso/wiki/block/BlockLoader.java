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
import teaso.wiki.block.floor.floor_2.*;
import teaso.wiki.block.floor.floor_3.*;
import teaso.wiki.block.wall.wall_1;

@Mod.EventBusSubscriber
public class BlockLoader {
    public static Block WALL_1 = new wall_1();
    public static Block FLOOR_1 = new floor_1();
    public static Block FLOOR_2_1 = new floor_2_1();
    public static Block FLOOR_2_2 = new floor_2_2();
    public static Block FLOOR_2_3 = new floor_2_3();
    public static Block FLOOR_2_4 = new floor_2_4();
    public static Block FLOOR_3_1 = new floor_3_1();
    public static Block FLOOR_3_2 = new floor_3_2();
    public static Block FLOOR_4 = new floor_4();

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        event.getRegistry().register(WALL_1.setRegistryName("loadmodel:wall_1"));
        event.getRegistry().register(FLOOR_1.setRegistryName("loadmodel:floor_1"));
        event.getRegistry().register(FLOOR_2_1.setRegistryName("loadmodel:floor_2_1"));
        event.getRegistry().register(FLOOR_2_2.setRegistryName("loadmodel:floor_2_2"));
        event.getRegistry().register(FLOOR_2_3.setRegistryName("loadmodel:floor_2_3"));
        event.getRegistry().register(FLOOR_2_4.setRegistryName("loadmodel:floor_2_4"));
        event.getRegistry().register(FLOOR_3_1.setRegistryName("loadmodel:floor_3_1"));
        event.getRegistry().register(FLOOR_3_2.setRegistryName("loadmodel:floor_3_2"));
        event.getRegistry().register(FLOOR_4.setRegistryName("loadmodel:floor_4"));
    }

    @SubscribeEvent
    public static void registerItemBlockModel(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_1),0,new ModelResourceLocation(WALL_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_1),0,new ModelResourceLocation(FLOOR_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_1),0,new ModelResourceLocation(FLOOR_2_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_2),0,new ModelResourceLocation(FLOOR_2_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_3),0,new ModelResourceLocation(FLOOR_2_3.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_2_4),0,new ModelResourceLocation(FLOOR_2_4.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_3_1),0,new ModelResourceLocation(FLOOR_3_1.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_3_2),0,new ModelResourceLocation(FLOOR_3_2.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_4),0,new ModelResourceLocation(FLOOR_4.getRegistryName(),"inventory"));
    }
}