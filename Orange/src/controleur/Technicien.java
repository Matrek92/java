package controleur;

public class Technicien {
	private int idtechnicien;
	private String nom, prenom, email, qualification, tel;
	
	public Technicien(int idtechnicien, String nom, String prenom, String email, String qualification, String tel) {
		this.idtechnicien = idtechnicien;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.qualification = qualification;
		this.tel = tel;
	}
	
	public Technicien( String nom, String prenom, String email, String qualification, String tel) {
		this.idtechnicien = 0;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.qualification = qualification;
		this.tel = tel;
	}
	
	public Technicien() {
		this.idtechnicien = 0;
		this.nom = "";
		this.prenom = "";
		this.email = "";
		this.qualification = "";
		this.tel = "";
	}

	public int getIdtechnicien() {
		return idtechnicien;
	}

	public void setIdtechnicien(int idtechnicien) {
		this.idtechnicien = idtechnicien;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
	