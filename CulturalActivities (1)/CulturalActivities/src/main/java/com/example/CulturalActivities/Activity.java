package com.example.CulturalActivities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Activity {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idActivite;
	private String nomActivite;
	private String descriptionActivite;
	private String niveauActivite;
	
	
	public Activity() {
		super();
	}
	
	public Activity(int idActivite, String nomActivite,String descriptionActivite, String niveauActivite) {
		super();
		
		this.idActivite = idActivite;
		this.nomActivite = nomActivite;
		this.descriptionActivite = descriptionActivite;
		this.niveauActivite = niveauActivite;
	}

	public int getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(int idActivite) {
		this.idActivite = idActivite;
	}
	public String getNomActivite() {
		return nomActivite;
	}

	public void setNomActivite(String nomActivite) {
		this.nomActivite = nomActivite;
	}
	
	public String getDescriptionActivite() {
		return descriptionActivite;
	}

	public void setDescriptionActivite(String descriptionActivite) {
		this.descriptionActivite = descriptionActivite;
	}
	public String getNiveauActivite() {
		return niveauActivite;
	}

	public void setNiveauActivite(String niveauActivite) {
		this.niveauActivite = niveauActivite;
	}


	@Override
	public String toString() {
		return "Activite [ nomActivite=" + nomActivite + ", idActivite=" + idActivite + ",descriptionActivite" + descriptionActivite + ", niveauActivite" + niveauActivite + "]";
	}

}
