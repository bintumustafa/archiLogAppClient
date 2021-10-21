package service;

import java.rmi.RMISecurityManager;

public class SecuManager {
	public static void main(String[] args) {
		  if (System.getSecurityManager() == null) {
		    System.setSecurityManager(new RMISecurityManager());
		  }
		}

}
