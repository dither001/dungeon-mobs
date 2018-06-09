package com.gw.dm;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gw.dm.entity.EntityGhoul;
import com.gw.dm.proxy.CommonProxy;
import com.gw.dm.util.AudioHandler;
import com.gw.dm.util.MobRegistrar;

@Mod(modid=DungeonMobs.MODID, name="Dungeon Mobs", version=DungeonMobs.VERSION)
public class DungeonMobs 
{
	public static final String MODID = "dungeonmobs";
    public static final String VERSION = "4.2.0";
    
    public static Block bladeTrap;
	public static Block lavaRock;
	public static Block beamosBlock;
	
	public static Potion potionAddle;
	public static int potionAddleID;
	
	//public static DungeonMobsEventHandler eventsHandler = new DungeonMobsEventHandler();
	
	public static boolean haveWarnedVersionOutOfDate = false;
    
    @Instance(MODID)
    public static DungeonMobs instance;
    
    @SidedProxy(clientSide="com.gw.dm.proxy.ClientProxy", 
    		serverSide="com.gw.dm.proxy.CommonProxy")
    public static CommonProxy proxy;

	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
    	//MinecraftForge.EVENT_BUS.register(new DungeonMobsEventSounds());
		
		ModMetadata modmeta = event.getModMetadata();
	    modmeta.authorList = Arrays.asList(new String[] { "GnomeWorks" });
	    modmeta.autogenerated = false;
	    modmeta.credits = "_303, ZeuX, r4wk, Zorn_Taov, Wreckage, Crudedragos, DraxisWuf, MohawkyMagoo";
	    modmeta.description = 
	    		"Adds a variety of new hostile mobs, all of which hate you.\n" +
	    		"Inspiration includes: Dungeons & Dragons, Legend of Zelda\n" + 
	    		"\n" + 
	    		"Rust Monster - Ghoul - Shrieker - Umber Hulk - Hook Horror - Beholder - Troll - Cave Fisher - Destrachan - Illithid - Hell Hound - Rakshasa - Lizalfos - Cockatrice - Manticore - Blade Trap - Thoqqua - Vescavor - Beamos\n";
	    		//"\n" +
	    		//"Includes support for: ExtraBiomesXL, Biomes O' Plenty, Highlands, Mob Spawn Controls";
	    modmeta.url = "http://www.minecraftforum.net/topic/231082-";
	    
	    //FMLCommonHandler.instance().bus().register(eventsHandler);
	    //MinecraftForge.EVENT_BUS.register(eventsHandler);
	    
	    /*
	    Configuration config = new Configuration( event.getSuggestedConfigurationFile() );
        
	    try {
                config.load( );
                
                for( Map.Entry<String, Integer> e : IDServer.defaultBlockIDs.entrySet( ) ) 
                {
                        String key = e.getKey();
                        int value = ((Integer)e.getValue( )).intValue( );
                        IDServer.blockIDs.put( key, config.getBlock( key, value ).getInt( value ) );
                }
                
                for( Map.Entry<String, Integer> e : IDServer.defaultItemIDs.entrySet( ) ) 
                {
                        String key = e.getKey();
                        int value = ((Integer)e.getValue( )).intValue( );
                        IDServer.itemIDs.put( key, config.getItem( key, value ).getInt( value ) );
                }
        } 
        catch( Exception e ) 
        {
                FMLLog.log(Level.SEVERE, e, "Unable to load config for Dungeon Mobs!");
        } 
        finally 
        {
                config.save( );
        }
	    */
	    
	    /*
	     * config land!
	     */
	    Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    
	    config.load();
	    
	    //Property updateCheck = config.get(Configuration.CATEGORY_GENERAL, "checkForUpdates", true);
	    //updateCheck.comment = "This value determines whether or not Dungeon Mobs will try to find out if there's a new update.";
	    //doUpdateCheck = updateCheck.getBoolean();
	    
	    //Property beholderSpawn = config.get(Configuration.CATEGORY_GENERAL, "spawnBeholder", true);
	    //beholderSpawn.comment = "These values determine if a given mob will spawn, if their spawn egg exists, and if they can show up in mob spawners. For blade traps, it also stops the block from generating. However, all blocks are still registered regardless of their parent mob's spawning status, to prevent potential issues.";
	    //spawnBeholder = beholderSpawn.getBoolean();
	    
	    //spawnRustMonster = config.get(Configuration.CATEGORY_GENERAL, "spawnRustMonster", true).getBoolean(true);
	    //spawnGhoul = config.get(Configuration.CATEGORY_GENERAL, "spawnGhoul", true).getBoolean(true);
		//spawnShrieker = config.get(Configuration.CATEGORY_GENERAL, "spawnShrieker", true).getBoolean(true);
		//spawnHookHorror = config.get(Configuration.CATEGORY_GENERAL, "spawnHookHorror", true).getBoolean(true);
		//spawnUmberHulk = config.get(Configuration.CATEGORY_GENERAL, "spawnUmberHulk", true).getBoolean(true);
		//spawnBladeTrap = config.get(Configuration.CATEGORY_GENERAL, "spawnBladeTrap", true).getBoolean(true);
		//spawnCaveFisher = config.get(Configuration.CATEGORY_GENERAL, "spawnCaveFisher", true).getBoolean(true);
		//spawnCockatrice = config.get(Configuration.CATEGORY_GENERAL, "spawnCockatrice", true).getBoolean(true);
		//spawnDestrachan = config.get(Configuration.CATEGORY_GENERAL, "spawnDestrachan", true).getBoolean(true);
		//spawnIllithid = config.get(Configuration.CATEGORY_GENERAL, "spawnIllithid", true).getBoolean(true);
		//spawnLizalfos = config.get(Configuration.CATEGORY_GENERAL, "spawnLizalfos", true).getBoolean(true);
		//spawnManticore = config.get(Configuration.CATEGORY_GENERAL, "spawnManticore", true).getBoolean(true);
		//spawnHellHound = config.get(Configuration.CATEGORY_GENERAL, "spawnHellHound", true).getBoolean(true);
		//spawnRakshasa = config.get(Configuration.CATEGORY_GENERAL, "spawnRakshasa", true).getBoolean(true);
		//spawnThoqqua = config.get(Configuration.CATEGORY_GENERAL, "spawnThoqqua", true).getBoolean(true);
		//spawnTroll = config.get(Configuration.CATEGORY_GENERAL, "spawnTroll", true).getBoolean(true);
		//spawnVescavor = config.get(Configuration.CATEGORY_GENERAL, "spawnVescavor", true).getBoolean(true);
	    
		//spawnBeamos = config.get(Configuration.CATEGORY_GENERAL, "spawnBeamos", true).getBoolean(true);
		
		config.save();
		
		haveWarnedVersionOutOfDate = !ConfigHandler.doUpdateCheck;
		
	    /*
	     * potion land!
	     */
	    Potion[] potionTypes = null;

	    for (Field f : Potion.class.getDeclaredFields()) 
	    {
	        f.setAccessible(true);
	        try 
	        {
	        	if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) 
	        	{
	                Field modfield = Field.class.getDeclaredField("modifiers");
	                modfield.setAccessible(true);
	                modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

	                potionTypes = (Potion[])f.get(null);
	                
	                if(potionTypes.length != 256)
	                {
		                final Potion[] newPotionTypes = new Potion[256];
		                System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
			            f.set(null, newPotionTypes);
			            
			            potionTypes = newPotionTypes;
	                }
	                else
	                	System.out.println("[DM] Potion index already set to max length.");
	            }
	        } 
	        catch (Exception e) 
	        {
	            System.err.println("[DM] Severe error, please report: ");
	            System.err.println(e);
	        }
	    }
	    
	    potionAddleID = getNextPotionIndex(potionTypes);
	    
	    /*if(potionAddleID == -1)
	    	System.out.println("[DM] Could not find an open potion index!");
	    else
		    potionAddle = (new PotionAddle(potionAddleID, false, 5787222)).setPotionName("Confusion");*/
	    
	    /*
	    for(int i = 0; i < potionTypes.length; i++)
	    {
	    	if(potionTypes[i] != null)
	    		System.out.println("Potion #" + i + ": " + potionTypes[i].getName());
	    	else
	    		System.out.println("Potion #" + i + ": NULL");
	    }
	    */
	    MobRegistrar.registerMobs();
    	proxy.registerRenders();
    }
	

    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	AudioHandler.registerSounds();
    	//MinecraftForge.TERRAIN_GEN_BUS.register(new DungeonMobsWorldGenEvent());
		
		/*
		 * Gotta do biome fetching for mod interoperability...
		 */
		
		ArrayList<Biome> allBiomes = new ArrayList<Biome>();
		
		ArrayList<Biome> hellBiomes = new ArrayList<Biome>();
		
		for(Biome biome : Biome.REGISTRY)
		{
			if(biome != null)
			{
				if(BiomeDictionary.hasType(biome, Type.NETHER))
					hellBiomes.add(biome);
				else if(!BiomeDictionary.hasType(biome, Type.END))
					allBiomes.add(biome);
			}
		}
		
		Biome[] biomeList = new Biome[allBiomes.size()];
		
		for(int i = 0; i < allBiomes.size(); i++)
		{
			biomeList[i] = allBiomes.get(i);
		}
		
		Biome[] hellList = new Biome[hellBiomes.size()];
		
		for(int i = 0; i < hellBiomes.size(); i++)
		{
			hellList[i] = hellBiomes.get(i);
		}
		
		/*
		BiomeGenBase[] biomeList = { BiomeGenBase.beach, 
				BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, 
				BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland,
				BiomeGenBase.taiga, BiomeGenBase.taigaHills,
				BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.deepOcean,
				BiomeGenBase.extremeHillsPlus, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver,
				BiomeGenBase.jungleEdge, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.roofedForest,
				BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach };
		*/
		

		

			EntityRegistry.addSpawn(EntityGhoul.class, 5, 2, 4, EnumCreatureType.MONSTER, biomeList);
		
		/*
		// RUST MONSTER
		if(spawnRustMonster)
		{
			EntityRegistry.registerModEntity(EntityRustMonster.class, "DMRustMonster", rustMonsterID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityRustMonster.class, 8, 1, 4, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg rustMonsterSpawn = new ItemSpawnEgg("DMRustMonster", 0x643200, 0x7C0F0F);
			rustMonsterSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(rustMonsterSpawn, "spawnEggRustMonster");
		}
		
		// SHRIEKER
		if(spawnShrieker)
		{
			EntityRegistry.registerModEntity(EntityShrieker.class, "DMShrieker", shriekerID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityShrieker.class, 5, 2, 4, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg shriekerSpawn = new ItemSpawnEgg("DMShrieker", 0xBBA786, 0xE4DCB0);
			shriekerSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(shriekerSpawn, "spawnEggShrieker");
		}
		
		// UMBER HULK
		if(spawnUmberHulk)
		{
			EntityRegistry.registerModEntity(EntityUmberHulk.class, "DMUmberHulk", umberHulkID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityUmberHulk.class, 2, 1, 1, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg umberHulkSpawn = new ItemSpawnEgg("DMUmberHulk", 0x734A12, 0x8B795E);
			umberHulkSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(umberHulkSpawn, "spawnEggUmberHulk");
		}
			
		// HOOK HORROR
		if(spawnHookHorror)
		{
			EntityRegistry.registerModEntity(EntityHookHorror.class, "DMHookHorror", hookHorrorID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityHookHorror.class, 4, 1, 4, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg hookHorrorSpawn = new ItemSpawnEgg("DMHookHorror", 0x4372AA, 0xD9D9F3);
			hookHorrorSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(hookHorrorSpawn, "spawnEggHookHorror");
		}
		
		// BEHOLDER
		if(spawnBeholder)
		{
			EntityRegistry.registerModEntity(EntityAhriman.class, "DMBeholder", ahrimanID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityAhriman.class, 2, 1, 1, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg beholderSpawn = new ItemSpawnEgg("DMBeholder", 0x720000, 0xFFF99A);
			beholderSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(beholderSpawn, "spawnEggBeholder");
			
			EntityRegistry.registerModEntity(EntityEyeRay.class, "DMEyeRay", eyerayID, instance, 80, 3, true);
		}
			
		// TROLL
		if(spawnTroll)
		{
			EntityRegistry.registerModEntity(EntityTroll.class, "DMTroll", trollID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityTroll.class, 6, 1, 4, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg trollSpawn = new ItemSpawnEgg("DMTroll", 0x164300, 0x292929);
			trollSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(trollSpawn, "spawnEggTroll");
		}
		
		// CAVE FISHER
		if(spawnCaveFisher)
		{
			EntityRegistry.registerModEntity(EntityCaveFisher.class, "DMCaveFisher", caveFisherID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityCaveFisher.class, 4, 1, 2, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg caveFisherSpawn = new ItemSpawnEgg("DMCaveFisher", 0xf6e7cc, 0x29a0b2);
			caveFisherSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(caveFisherSpawn, "spawnEggCaveFisher");
		}
			
		// DESTRACHAN
		if(spawnDestrachan)
		{
			EntityRegistry.registerModEntity(EntityDestrachan.class, "DMDestrachan", destrachanID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityDestrachan.class, 5, 1, 3, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg destrachanSpawn = new ItemSpawnEgg("DMDestrachan", 0xc99918, 0x161616);
			destrachanSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(destrachanSpawn, "spawnEggDestrachan");
			
			EntityRegistry.registerModEntity(EntitySonicBoom.class, "DMSonicBoom", sonicBoomID, instance, 80, 3, true);
		}
		
		// ILLITHID
		if(spawnIllithid)
		{
			EntityRegistry.registerModEntity(EntityIllithid.class, "DMIllithid", illithidID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityIllithid.class, 3, 1, 1, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg illithidSpawn = new ItemSpawnEgg("DMIllithid", 0x9932CD, 0xf6f4ba);
			illithidSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(illithidSpawn, "spawnEggIllithid");
		}
		
		// HELL HOUND
		if(spawnHellHound)
		{
			EntityRegistry.registerModEntity(EntityNetherHound.class, "DMHellHound", netherHoundID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityNetherHound.class, 4, 1, 2, EnumCreatureType.monster, biomeList);
			EntityRegistry.addSpawn(EntityNetherHound.class, 10, 4, 4, EnumCreatureType.monster, hellList);
			ItemSpawnEgg netherHoundSpawn = new ItemSpawnEgg("DMHellHound", 0xf9390d, 0x775532);
			netherHoundSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(netherHoundSpawn, "spawnEggHellHound");
		}
		
		// RAKSHASA
		if(spawnRakshasa)
		{
			EntityRegistry.registerModEntity(EntityRakshasa.class, "DMRakshasa", rakshasaID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityRakshasa.class, 3, 1, 1, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg rakshasaSpawn = new ItemSpawnEgg("DMRakshasa", 0xa06c3e, 0xdec580);
			rakshasaSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(rakshasaSpawn, "spawnEggRakshasa");
			
			EntityRegistry.registerModEntity(EntityRakshasaImage.class, "DMRakshasaImage", rakshasaImageID, instance, 80, 3, true);
			
			EntityRegistry.registerModEntity(EntityMagicMissile.class, "DMMagicMissile", magicMissileID, instance, 80, 3, true);
		}
			
		// LIZALFOS
		if(spawnLizalfos)
		{
			EntityRegistry.registerModEntity(EntityLizalfos.class, "DMLizalfos", lizalfosID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityLizalfos.class, 2, 1, 2, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg lizalfosSpawn = new ItemSpawnEgg("DMLizalfos", 0x257a36, 0xe5d067);
			lizalfosSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(lizalfosSpawn, "spawnEggLizalfos");
		}
		
		// COCKATRICE
		if(spawnCockatrice)
		{
			EntityRegistry.registerModEntity(EntityCockatrice.class, "DMCockatrice", cockatriceID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityCockatrice.class, 5, 1, 3, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg cockatriceSpawn = new ItemSpawnEgg("DMCockatrice", 0x8acf92, 0x93ab96);
			cockatriceSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(cockatriceSpawn, "spawnEggCockatrice");
				
			EntityRegistry.registerModEntity(EntityPetrified.class, "DMPetrified", petrifiedID, this, 80, 3, true);
		}
		
		// MANTICORE
		if(spawnManticore)
		{
			EntityRegistry.registerModEntity(EntityManticore.class, "DMManticore", manticoreID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityManticore.class, 4, 1, 2, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg manticoreSpawn = new ItemSpawnEgg("DMManticore", 0xd28247, 0x201f1d);
			manticoreSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(manticoreSpawn, "spawnEggManticore");
		}
		
    	// BLADE TRAP
		if(spawnBladeTrap)
		{
			EntityRegistry.registerModEntity(EntityBladeTrap.class, "DMBladeTrap", bladeTrapID, instance, 80, 3, true);
			ItemSpawnEgg bladeTrapSpawn = new ItemSpawnEgg("DMBladeTrap", 0x464646, 0xb70202);
			bladeTrapSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(bladeTrapSpawn, "spawnEggBladeTrap");
		}
		
    	bladeTrap = new BlockBladeTrap(Material.iron).setBlockTextureName("dungeonmobs:BladeTrap").setHardness(20.0F).setResistance(20F).setTickRandomly(true).setBlockName("bladetrap");
    	GameRegistry.registerBlock(bladeTrap, "bladetrap");
    	
    	GameRegistry.registerTileEntity(TileEntityBladeTrap.class, "bladeTrapTile");
    	
    	// THOQQUA
    	if(spawnThoqqua)
    	{
	    	EntityRegistry.registerModEntity(EntityThoqqua.class, "DMThoqqua", thoqquaID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityThoqqua.class, 3, 1, 1, EnumCreatureType.monster, biomeList);
			EntityRegistry.addSpawn(EntityThoqqua.class, 6, 1, 2, EnumCreatureType.monster, hellList);
			ItemSpawnEgg thoqquaSpawn = new ItemSpawnEgg("DMThoqqua", 0xf1c33a, 0xb08968);
			thoqquaSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(thoqquaSpawn, "spawnEggThoqqua");
    	}
    	
    	lavaRock = new BlockLavarock(Material.rock).setBlockTextureName("dungeonmobs:Lavarock").setHardness(1.0F).setResistance(12F).setTickRandomly(true).setBlockName("lavarock");
		GameRegistry.registerBlock(lavaRock, "LavaRock");
		
		// VESCAVOR
		if(spawnVescavor)
		{
			EntityRegistry.registerModEntity(EntityVescavor.class, "DMVescavor", vescavorID, instance, 80, 3, true);
			EntityRegistry.addSpawn(EntityVescavor.class, 6, 2, 8, EnumCreatureType.monster, biomeList);
			ItemSpawnEgg vescavorSpawn = new ItemSpawnEgg("DMVescavor", 0x170007, 0xa05155);
			vescavorSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(vescavorSpawn, "spawnEggVescavor");
		}
		
		// BEAMOS
		if(spawnBeamos)
		{
			EntityRegistry.registerModEntity(EntityBeamos.class, "DMBeamos", beamosID, instance, 80, 3, true);
			ItemSpawnEgg beamosSpawn = new ItemSpawnEgg("DMBeamos", 0x535353, 0x235712);
			beamosSpawn.setTextureName("dungeonmobs:spawn_egg");
			GameRegistry.registerItem(beamosSpawn, "spawnEggBeamos");
			
	    	EntityRegistry.registerModEntity(EntityBeamosBeam.class, "DMBeamosBeam", beamosBeamID, instance, 80, 3, true);
		}*/
    	
    	//EntityShrieker.appendToSummonList("DMRustMonster");
		//EntityShrieker.appendToSummonList("DMGhoul");
		//EntityShrieker.appendToSummonList("DMBeholder");
		//EntityShrieker.appendToSummonList("DMUmberHulk");
		//EntityShrieker.appendToSummonList("DMTroll");
		//EntityShrieker.appendToSummonList("DMHookHorror");
		//EntityShrieker.appendToSummonList("DMBeholder");
		//EntityShrieker.appendToSummonList("DMCaveFisher");
		//EntityShrieker.appendToSummonList("DMDestrachan");
		//EntityShrieker.appendToSummonList("DMIllithid");
		//EntityShrieker.appendToSummonList("DMNetherHound");
		//EntityShrieker.appendToSummonList("DMRakshasa");
		//EntityShrieker.appendToSummonList("DMLizalfos");
		//EntityShrieker.appendToSummonList("DMCockatrice");
		//EntityShrieker.appendToSummonList("DMManticore");
		//EntityShrieker.appendToSummonList("DMThoqqua");
		//EntityShrieker.appendToSummonList("DMVescavor");
		
		allBiomes = null;
		hellBiomes = null;
		biomeList = null;
		hellList = null;
    }
    

    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	MobRegistrar.registerSpawns();
    	//BiomeDictionary.registerAllBiomes();
    	
    	//ArrayList<Set<Biome>> biomes = new ArrayList<>;
    	Biome[][] biomes = { 
    			getBiomesForType(Type.BEACH),
	    		getBiomesForType(Type.COLD),
	    		getBiomesForType(Type.CONIFEROUS),
	    		getBiomesForType(Type.DEAD),
	    		getBiomesForType(Type.DENSE),
	    		getBiomesForType(Type.DRY),
	    		getBiomesForType(Type.FOREST),
	    		getBiomesForType(Type.HILLS),
	    		getBiomesForType(Type.HOT),
	    		getBiomesForType(Type.JUNGLE), 
	    		getBiomesForType(Type.LUSH),
	    		getBiomesForType(Type.MAGICAL),
	    		getBiomesForType(Type.MESA),
	    		getBiomesForType(Type.MUSHROOM),
	    		getBiomesForType(Type.OCEAN),
	    		getBiomesForType(Type.PLAINS),
	    		getBiomesForType(Type.RIVER),
	    		getBiomesForType(Type.SANDY),
	    		getBiomesForType(Type.SAVANNA),
	    		getBiomesForType(Type.SNOWY),
	    		getBiomesForType(Type.SPARSE),
	    		getBiomesForType(Type.SPOOKY),
	    		getBiomesForType(Type.SWAMP),
	    		getBiomesForType(Type.WASTELAND),
	    		getBiomesForType(Type.WATER),
	    		getBiomesForType(Type.WET) 
    	};
    	
    	boolean doBeholderSpawn;
    	boolean doCaveFisherSpawn;
    	boolean doCockatriceSpawn;
    	boolean doDestrachanSpawn;
    	boolean doGhoulSpawn;
    	boolean doHookHorrorSpawn;
    	boolean doIllithidSpawn;
    	boolean doLizalfosSpawn;
    	boolean doManticoreSpawn;
    	boolean doHellHoundSpawn;
    	boolean doRakshasaSpawn;
    	boolean doRustMonsterSpawn;
    	boolean doShriekerSpawn;
    	boolean doTrollSpawn;
    	boolean doUmberHulkSpawn;
    	boolean doVescavorSpawn;
    	boolean doThoqquaSpawn;
    	
    	for(int i = 0; i < biomes.length; i++)
    	{
    		for(int j = 0; j < biomes[i].length; j++)
    		{
    			doBeholderSpawn = true;
    			doCaveFisherSpawn = true;
    			doCockatriceSpawn = true;
    			doDestrachanSpawn = true;
    			doGhoulSpawn = true;
    			doHookHorrorSpawn = true;
    			doIllithidSpawn = true;
    			doLizalfosSpawn = true;
    			doManticoreSpawn = true;
    			doHellHoundSpawn = true;
    			doRakshasaSpawn = true;
    			doRustMonsterSpawn = true;
    			doShriekerSpawn = true;
    			doTrollSpawn = true;
    			doUmberHulkSpawn = true;
    			doVescavorSpawn = true;
    			doThoqquaSpawn = true;
    			
    			List foo = biomes[i][j].getSpawnableList(EnumCreatureType.MONSTER);
    			
    			for(int k = 0; k < foo.size(); k++)
    			{/*
    				SpawnListEntry bar = (SpawnListEntry)foo.get(k);
    				
    				Class<? extends Entity> entityClazz = bar.entityClass;
    				
    				if(entityClazz.getName() == EntityAhriman.class.getName())
    					doBeholderSpawn = false;
    				
    				if(entityClazz.getName() == EntityCaveFisher.class.getName())
    					doCaveFisherSpawn = false;
    				
    				if(entityClazz.getName() == EntityCockatrice.class.getName())
    					doCockatriceSpawn = false;
    				
    				if(entityClazz.getName() == EntityDestrachan.class.getName())
    					doDestrachanSpawn = false;
    				
    				if(entityClazz.getName() == EntityGhoul.class.getName())
    					doGhoulSpawn = false;
    				
    				if(entityClazz.getName() == EntityHookHorror.class.getName())
    					doHookHorrorSpawn = false;
    				
    				if(entityClazz.getName() == EntityIllithid.class.getName())
    					doIllithidSpawn = false;
    				
    				if(entityClazz.getName() == EntityLizalfos.class.getName())
    					doLizalfosSpawn = false;
    				
    				if(entityClazz.getName() == EntityManticore.class.getName())
    					doManticoreSpawn = false;
    				
    				if(entityClazz.getName() == EntityNetherHound.class.getName())
    					doHellHoundSpawn = false;
    				
    				if(entityClazz.getName() == EntityRakshasa.class.getName())
    					doRakshasaSpawn = false;
    				
    				if(entityClazz.getName() == EntityRustMonster.class.getName())
    					doRustMonsterSpawn = false;
    				
    				if(entityClazz.getName() == EntityShrieker.class.getName())
    					doShriekerSpawn = false;
    				
    				if(entityClazz.getName() == EntityThoqqua.class.getName())
    					doThoqquaSpawn = false;
    				
    				if(entityClazz.getName() == EntityTroll.class.getName())
    					doTrollSpawn = false;
    				
    				if(entityClazz.getName() == EntityUmberHulk.class.getName())
    					doUmberHulkSpawn = false;
    				
    				if(entityClazz.getName() == EntityVescavor.class.getName())
    					doVescavorSpawn = false;
    				
    				
    				//if(entityClazz.getClass().isInstance(EntityVescavor.class))
    				//{
    				//	System.out.println("[" + i + "][" + j + "][" + k + "] HOLY FUCKING SHIT REFLECTION WORKS");
    				//}
    				//
    			*/}
    			
    			/*if(doBeholderSpawn && spawnBeholder)
    				EntityRegistry.addSpawn(EntityAhriman.class, 2, 1, 1, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doRustMonsterSpawn && spawnRustMonster)
    				EntityRegistry.addSpawn(EntityRustMonster.class, 8, 1, 4, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doGhoulSpawn && spawnGhoul)
    				EntityRegistry.addSpawn(EntityGhoul.class, 5, 2, 4, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doShriekerSpawn && spawnShrieker)
    				EntityRegistry.addSpawn(EntityShrieker.class, 5, 2, 4, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doUmberHulkSpawn && spawnUmberHulk)
    				EntityRegistry.addSpawn(EntityUmberHulk.class, 2, 1, 1, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doHookHorrorSpawn && spawnHookHorror)
    				EntityRegistry.addSpawn(EntityHookHorror.class, 4, 1, 4, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doTrollSpawn && spawnTroll)
    				EntityRegistry.addSpawn(EntityTroll.class, 6, 1, 4, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doCaveFisherSpawn && spawnCaveFisher)
    				EntityRegistry.addSpawn(EntityCaveFisher.class, 4, 1, 2, EnumCreatureType.monster, biomes[i][j]);

    			if(doDestrachanSpawn && spawnDestrachan)
    				EntityRegistry.addSpawn(EntityDestrachan.class, 5, 1, 3, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doIllithidSpawn && spawnIllithid)
    				EntityRegistry.addSpawn(EntityIllithid.class, 3, 1, 1, EnumCreatureType.monster, biomes[i][j]);

    			if(doHellHoundSpawn && spawnHellHound)
    				EntityRegistry.addSpawn(EntityNetherHound.class, 4, 1, 2, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doRakshasaSpawn && spawnRakshasa)
    				EntityRegistry.addSpawn(EntityRakshasa.class, 3, 1, 1, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doLizalfosSpawn && spawnLizalfos)
    				EntityRegistry.addSpawn(EntityLizalfos.class, 2, 1, 2, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doCockatriceSpawn && spawnCockatrice)
    				EntityRegistry.addSpawn(EntityCockatrice.class, 5, 1, 3, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doManticoreSpawn && spawnManticore)
    				EntityRegistry.addSpawn(EntityManticore.class, 4, 1, 2, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doThoqquaSpawn && spawnThoqqua)
    				EntityRegistry.addSpawn(EntityThoqqua.class, 3, 1, 1, EnumCreatureType.monster, biomes[i][j]);
    			
    			if(doVescavorSpawn && spawnVescavor)
    				EntityRegistry.addSpawn(EntityVescavor.class, 6, 2, 8, EnumCreatureType.monster, biomes[i][j]);
    			
    			//
    			//if(biomes[i][j].getSpawnableList(EnumCreatureType.monster).contains(EntityVescavor.class))
    			//	System.out.println("[DM] YEP THIS SHIT WORKS.");
    			//else
    			//	System.out.println("[DM] WELL IT KINDA WORKS...");
    			//
    			//System.out.println("[DM] DEBUG SHIT: " + biomes[i][j].getSpawnableList(EnumCreatureType.monster).toString());
    			//
    			
    			//EntityRegistry.addSpawn(EntityVescavor.class, 6, 2, 8, EnumCreatureType.monster, biomes[i]);
    			*/
    		}
    	}
    	
    	/*
    	List foo = biomes[8][2].getSpawnableList(EnumCreatureType.monster);
    	
    	for(int i = 0; i < foo.size(); i++)
    	{
    		System.out.println("[DM] " + foo.get(i).toString());
    	}
    	*/
    	
    	/*if(spawnRustMonster)
    		DungeonHooks.addDungeonMob("DMRustMonster", 80);
    	
    	if(spawnGhoul)
    		DungeonHooks.addDungeonMob("DMGhoul", 125);
    	
    	if(spawnUmberHulk)
    		DungeonHooks.addDungeonMob("DMUmberHulk", 25);
    	
    	if(spawnHookHorror)
    		DungeonHooks.addDungeonMob("DMHookHorror", 75);
    	
    	if(spawnBeholder)
    		DungeonHooks.addDungeonMob("DMBeholder", 10);
    	
    	if(spawnCaveFisher)
    		DungeonHooks.addDungeonMob("DMCaveFisher", 90);
    	
    	if(spawnDestrachan)
    		DungeonHooks.addDungeonMob("DMDestrachan", 35);
    	
    	if(spawnIllithid)
    		DungeonHooks.addDungeonMob("DMIllithid", 15);
    	
    	if(spawnHellHound)
    		DungeonHooks.addDungeonMob("DMNetherHound", 50);
    	
    	if(spawnRakshasa)
    		DungeonHooks.addDungeonMob("DMRakshasa", 15);
    	
    	if(spawnLizalfos)
    		DungeonHooks.addDungeonMob("DMLizalfos", 10);
    	
    	if(spawnCockatrice)
    		DungeonHooks.addDungeonMob("DMCockatrice", 30);
    	
    	if(spawnManticore)
    		DungeonHooks.addDungeonMob("DMManticore", 35);
    	
    	if(spawnThoqqua)
    		DungeonHooks.addDungeonMob("DMThoqqua", 20);
		
		if(spawnVescavor)
			DungeonHooks.addDungeonMob("DMVescavor", 40);
    */}

    
    private int getNextPotionIndex(Potion[] potList)
    {
    	
    	
    	if(potList != null)
	    {
	    	for(int i = 0; i < potList.length; i++)
	    	{
	    		if(potList[i] == null)
	    		{
	    			System.out.println("[DM] Utilizing Potion ID #" + i + ".");
	    			return i;
	    		}
	    	}
	    }
    	
    	return -1;
    }
    
    
    private static Biome[] getBiomesForType(Type t) {
    	Set<Biome> biomes = BiomeDictionary.getBiomes(t);
    	return biomes.toArray(new Biome[biomes.size()]);
    }
    
    
}
