package com.arpan.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor{

	CommandExecutor commandExecutor;
	private boolean isAdminUser=false;
	
	public CommandExecutorProxy(String userName, String password) {
		if("arpan".equals(userName) && "arpan".equals(password)){
			isAdminUser=true;
			commandExecutor=new CommandExecutorImpl();
		}
	}

	public void runCommand(String command) throws IOException {
		if(isAdminUser){
			commandExecutor.runCommand(command);
		}else{
			System.out.println("Admin user have only rights to execute the command");
		}
		
	}

}
