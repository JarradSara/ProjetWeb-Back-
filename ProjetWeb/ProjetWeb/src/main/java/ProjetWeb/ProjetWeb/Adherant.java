package ProjetWeb.ProjetWeb;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Adherant {

	@org.springframework.data.annotation.Id
	private int idAdherant;
	private String nomAdherant;
	private String prenomAdherant;
	private int ageAdherant;
	private String emailAdherant;
	private String adresseAdherant;
	
	
	
	
	public Adherant() {
		super();
	}
	
	public Adherant(int idAdherant, String nomAdherant, String prenomAdherant, int ageAdherant, String emailAdherant, String adresseAdherant) {
		super();
		this.idAdherant = idAdherant;
		this.nomAdherant = nomAdherant;
		this.prenomAdherant = prenomAdherant;
		this.ageAdherant = ageAdherant;
		this.emailAdherant = emailAdherant;
		this.adresseAdherant = adresseAdherant;
		
	}

	

	public int getIdAdherant() {
		return idAdherant;
	}
	
	public void setIdAdherant(int idAdherant) {
		this.idAdherant = idAdherant;
	}
	
	public String getNomAdherant() {
		return nomAdherant;
	}

	public void setNomAdherant(String nomAdherant) {
		this.nomAdherant = nomAdherant;
	}

	public String getPrenomAdherant() {
		return prenomAdherant;
	}
	
	public void setPrenomAdherant(String prenomAdherant) {
		this.prenomAdherant = prenomAdherant;
	}
	
	public int getAgeAdherant() {
		return ageAdherant;
	}
	
	public void setAgeAdherant(int ageAdherant) {
		this.ageAdherant = ageAdherant;
	}
	
	public String getEmailAdherant() {
		return emailAdherant;
	}
	
	public void setEmailAdherant(String emailAdherant) {
		this.emailAdherant = emailAdherant;
	}
	
	public String getAdresseAdherant() {
		return adresseAdherant;
	}
	
	public void setAdresseAdherant(String adresseAdherant) {
		this.adresseAdherant = adresseAdherant;
	}
	
	

	@Override
	public String toString() {
		return "Adherant [idAdherant=" + idAdherant + ", nomAdherant=" + nomAdherant + ", prenomAdherant=" + prenomAdherant + ", ageAdherant=" + ageAdherant + ", emailAdherant=" + emailAdherant + ", adresseAdherant=" + adresseAdherant +  "]";
	}

}

