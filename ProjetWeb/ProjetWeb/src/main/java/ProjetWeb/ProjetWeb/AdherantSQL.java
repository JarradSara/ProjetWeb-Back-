package ProjetWeb.ProjetWeb;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class AdherantSQL {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAdherant;
	private String nomAdherant;
	private String prenomAdherant;
	private int ageAdherant;
	private String emailAdherant;
	private String adresseAdherant;
	
	
	
	public AdherantSQL() {
		super();
	}
	
	public AdherantSQL(int idAdherant, String nomAdherant, String prenomAdherant, int ageAdherant, String emailAdherant, String adresseAdherant) {
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
	
 
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(targetEntity=Pret.class ,mappedBy="adherant") 
	@JsonIgnore
	private List<Pret> dates = new ArrayList<Pret>();
	
	public List<Pret>getDatePret(){
		return dates;
	}
	public void setDatePret(ArrayList<Pret> dates) {
		this.dates=dates;
	}
	public void addPret(Pret pret) {
		this.getDatePret().add(pret);
		pret.adherant = this;
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
		return "Adherant [idAdherant=" + idAdherant + ", nomAdherant=" + nomAdherant + ", prenomAdherant=" + prenomAdherant + ", ageAdherant=" + ageAdherant + ", emailAdherant=" + emailAdherant + ", adresseAdherant=" + adresseAdherant + "]";
	}

}

