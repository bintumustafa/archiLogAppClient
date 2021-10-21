package pojo;

public class User {
	private String id;
	private String username;
	private char [] mdp;
	private String nom;
	private String prenom;
	
	public User(String username, char[] mdp) {
		super();
		this.username = username;
		this.mdp = mdp;
	}
	
	
	public User(String id, String username, char[] mdp, String nom, String prenom) {
		super();
		this.id = id;
		this.username = username;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
	}


	public User() {
		super();
	}

	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getMdp() {
		return mdp;
	}

	public void setMdp(char[] mdp) {
		this.mdp = mdp;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
