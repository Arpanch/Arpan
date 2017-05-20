package com.arpan.proxy;

import java.io.IOException;

public class ProxyMain {
	public static void main(String[] args) {
		CommandExecutorProxy commandExecutorProxy=new CommandExecutorProxy("arpan","arpan");
		try {
			commandExecutorProxy.runCommand("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
