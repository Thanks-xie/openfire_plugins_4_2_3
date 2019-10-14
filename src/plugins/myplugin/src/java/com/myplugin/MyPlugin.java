package com.myplugin;

import java.io.File;

import org.jivesoftware.openfire.IQHandlerInfo;
import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.auth.UnauthorizedException;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;
import org.jivesoftware.openfire.handler.IQHandler;
import org.xmpp.packet.IQ;

public class MyPlugin implements Plugin{
	
	private XMPPServer xMPPServer;
	
	@Override
	public void initializePlugin(PluginManager manager, File pluginDirectory) {
		// TODO Auto-generated method stub
		xMPPServer = XMPPServer.getInstance();
		System.out.println("MyPlugin----start");
        System.out.println(xMPPServer.getServerInfo());
	}

	@Override
	public void destroyPlugin() {
		// TODO Auto-generated method stub
		System.out.println("MyPlugin----destroy");
	}

}
