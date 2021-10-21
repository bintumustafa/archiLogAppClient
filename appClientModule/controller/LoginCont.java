package controller;

import service.LoginServ;

public class LoginCont {
	private String connect;
	
	
	public LoginCont() {
		super();
	}

	public LoginCont(String connect) {
		super();
		this.connect = connect;
	}
 
	public String getConnect() {
		return connect;
	}

	public void setConnect(String connect) {
		this.connect = connect;
	}

	public boolean controlerInput(String log, char [] mdp ) {
		boolean correct = false;
		String mp = String.valueOf(mdp);
		if ((log.length()>0 && log.length()<=255) && (mdp.length>0 && mdp.length<=255)) {
			LoginServ ls = new LoginServ();
			this.connect = ls.connect(log, mp);
			correct = true;
		}	
		
		return correct;
		
	}

}
