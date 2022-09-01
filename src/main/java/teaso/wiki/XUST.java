package teaso.wiki;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teaso.wiki.block.BlockLoader;
import teaso.wiki.common.CommonProxy;
import teaso.wiki.item.ItemLoader;

@Mod(modid = XUST.MODID, name = XUST.NAME, version = XUST.VERSION, acceptedMinecraftVersions = "1.12.2")
public class XUST {
    public static final String MODID = "loadmodel";
    public static final String NAME = "LoadModel";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(XUST.MODID)
    public static XUST instance;

    @SidedProxy(clientSide = "teaso.wiki.client.ClientProxy",
            serverSide = "teaso.wiki.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    // 创造模式物品栏

    // 标识
    public static final CreativeTabs MY_TAB0 = new CreativeTabs("icon") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockLoader.XUST_0);
        }
    };

    // 地板
    public static final CreativeTabs MY_TAB1 = new CreativeTabs("floor") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockLoader.FLOOR_1_1);
        }
    };

    // 墙体
    public static final CreativeTabs MY_TAB2 = new CreativeTabs("wall") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockLoader.FLOOR_1_1);
        }
    };

}

