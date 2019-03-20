package com.jtrent238.jtloader;

import java.io.File;
import java.nio.file.Files;

import net.minecraft.command.ICommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;

@Mod(modid=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION)/*, dependencies="required-after:jtrent238core@[" + YouTubers.COREVERSION + "]"*/)
//@MeddleMod(id=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION), author=Main.MODAUTHOR)
public class Main 
{

	
	//@SidedProxy(clientSide="com.jtrent238.jtloader.client.ClientProxy", serverSide="com.jtrent238.jtloader.common.CommonProxy")
	//public static CommonProxy proxy;
	
	
	public static final String MODID = "jtloader";

	@Instance(MODID)
  public static Main instance;
	public static final String MODVERSION = "1.0.0.0";
	public final static String COREVERSION = "1.0.0.3";
	public static final String MODNAME = "jtrent238's Legacy Mod Loader";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.12.2";
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
  public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{

	File fileMods = new File("JTLoader\\mods");

	if (fileMods.exists()) {
	    System.out.println("mods folder already exists");
	    processMods();
	} else {
		new File("JTLoader\\mods").mkdir();
	}
	
	File fileConfigs = new File("JTLoader\\config");

	if (fileConfigs.exists()) {
	    System.out.println("config folder already exists");
	} else {
		new File("JTLoader\\config").mkdir();
	}
}



private void processMods() {
	
	int numFiles = new File("JTLoader\\mods").list().length;

	for (int i = numFiles; i < numFiles; i++) {
		String fileName = new File("JTLoader\\mods").list().toString();
		System.out.printf("Found file %s. Going to treat it as a mod.", fileName);
	}
}


@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	//proxy.init(event);
}



public static Object logger;


@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {

}


					
}