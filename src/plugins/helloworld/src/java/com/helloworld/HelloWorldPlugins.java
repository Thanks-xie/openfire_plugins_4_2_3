package com.helloworld;

import java.io.File;

import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

public class HelloWorldPlugins implements Plugin {
	
	private XMPPServer xmppServer;
	
	public HelloWorldPlugins() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializePlugin(PluginManager manager, File pluginDirectory) {
		// TODO Auto-generated method stub
		xmppServer = XMPPServer.getInstance();
		System.out.println("HelloWorldPlugin----start");
		System.out.println(xmppServer.getServerInfo());
	}

	@Override
	public void destroyPlugin() {
		// TODO Auto-generated method stub
		System.out.println("HelloWorldPlugin----destroy");
	}

}
