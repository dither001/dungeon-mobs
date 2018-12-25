package com.gw.dm;

import com.gw.dm.compat.DLDCompat;
import com.gw.dm.entity.EntityLizalfos;
import com.gw.dm.proxy.CommonProxy;
import com.gw.dm.util.*;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Arrays;

@Mod(modid = DungeonMobs.MODID, name = "Dungeon Mobs", version = DungeonMobs.VERSION,
		dependencies = "after:thaumcraft; after:dldungeonsjbg; after:dldungeonjbg")
public class DungeonMobs {
	public static final String MODID = "dungeonmobs";
	public static final String VERSION = "5.5.3";

	@Instance(MODID)
	public static DungeonMobs instance;
	@SidedProxy(clientSide = "com.gw.dm.proxy.ClientProxy",
			serverSide = "com.gw.dm.proxy.CommonProxy")
	public static CommonProxy proxy;
	private static boolean gotDLD;
	DMGenerationHandler worldGen;

	private static void initMonsterSpecialData() {
		EntityLizalfos.initLocations();
		DMGenerationHandler.initTargetBlocks();
		ConfigHandler.mobSpecialSetup();
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModMetadata modmeta = event.getModMetadata();
		modmeta.authorList = Arrays.asList(new String[]{"GnomeWorks", "JaredBGreat", "Sunconure"});
		modmeta.autogenerated = false;
		modmeta.credits = "_303, ZeuX, r4wk, Zorn_Taov, Wreckage, Crudedragos, DraxisWuf, MohawkyMagoo";
		modmeta.description =
				"Adds a variety of new hostile mobs, all of which hate you.\n" +
						"Inspiration includes: Dungeons & Dragons, Legend of Zelda\n" +
						"\n" +
						"Rust Monster - Ghoul - Shrieker - Umber Hulk - Hook Horror "
						+ "- Beholder - Troll - Cave Fisher - Destrachan - Illithid "
						+ "- Hell Hound - Rakshasa - Lizalfos - Cockatrice - Manticore "
						+ "- Thoqqua - Vescavor - Revenant - Vampire - Fallen Angel - Outer Thing\n";
		modmeta.url = "https://minecraft.curseforge.com/projects/dungeon-mobs-reborn";


		ConfigHandler.configDir = ConfigHandler.findConfigDir(event.getModConfigurationDirectory());
		ConfigHandler.init();

		MiscRegistrar.initBlocks();


		MobRegistrar.registerMobs();
		if (ConfigHandler.spawnNaturally) {
			MobRegistrar.registerSpawns();
		}
		if (ConfigHandler.addToVanillaDungeons) {
			MobRegistrar.addToVanillaDungeons();
		}
		proxy.registerRenders();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		AudioHandler.registerSounds();
		if (ConfigHandler.spawnBladeTrap) {
			worldGen = new DMGenerationHandler();
		}
		if(ConfigHandler.addToDoomlikeDungeons) {
			DLDCompat.addDLD();
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {		
		initMonsterSpecialData();
	}

}
