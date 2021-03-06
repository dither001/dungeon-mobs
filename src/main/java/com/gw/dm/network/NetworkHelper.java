package com.gw.dm.network;


import com.gw.dm.DungeonMobs;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

import static com.gw.dm.network.NetworkHelper.PacketType.CONFUSION;
import static com.gw.dm.network.NetworkHelper.PacketType.KNOCKBACK;

public class NetworkHelper {
	public static final SimpleNetworkWrapper NETWRAPPER
			= NetworkRegistry.INSTANCE.newSimpleChannel(DungeonMobs.MODID);
	private static NetworkHelper HELPER;

	private NetworkHelper() {
		NETWRAPPER.registerMessage(KnockbackPacketHandler.class, KnockBackPacket.class,
				KNOCKBACK.id, Side.CLIENT);
		NETWRAPPER.registerMessage(ConfusionPacketHandler.class, ConfusionPacket.class,
				CONFUSION.id, Side.CLIENT);
	}

	public static NetworkHelper getNetworkHelper() {
		if (HELPER == null) {
			HELPER = new NetworkHelper();
		}
		return HELPER;
	}

	public void sendPacketToPlayer(IMessage message, EntityPlayerMP player) {
		NETWRAPPER.sendTo(message, player);
	}


	public static enum PacketType {
		KNOCKBACK(0),
		CONFUSION(1);
		public final int id;

		PacketType(int type) {
			id = type;
		}
	}
}
