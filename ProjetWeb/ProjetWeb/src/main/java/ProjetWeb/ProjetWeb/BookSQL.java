package ProjetWeb.ProjetWeb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BookSQL {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codeBarre;
	private String nomOuvrage;
	private String nomAuteur;
	private String numEdition;
	
	public BookSQL() {
		super();
	}
	
	public BookSQL(String nomOuvrage, String nomAuteur, String numEdition, int codeBarre) {
		super();
		this.nomOuvrage = nomOuvrage;
		this.nomAuteur = nomAuteur;
		this.numEdition = numEdition;
		this.codeBarre = codeBarre;
	}
	

	public int getCodeBarre() {
		return codeBarre;
	}
	
	public void setCodeBarre(int codeBarre) {
		this.codeBarre = codeBarre;
	}
	
	@OneToMany(targetEntity=Pret.class, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Pret> dates = new ArrayList<Pret>(); 
	

	public List<Pret> getDatePret(){
		return dates;
	}
	public void setDatePret(List<Pret> dates) {
		this.dates=dates;
	}
	
	public void addPret(Pret pret) {
		this.getDatePret().add(pret);
		pret.book = this;
	}
	

	public List<Pret> getDates() {
		return dates;
	}

	public void setDates(ArrayList<Pret> dates) {
		this.dates = dates;
	}

	public String getNomOuvrage() {
		return nomOuvrage;
	}
	
	public void setNomOuvrage(String nomOuvrage) {
		this.nomOuvrage = nomOuvrage;
	}
	
	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public String getNumEdition() {
		return numEdition;
	}
	
	public void setNumEdition(String numEdition) {
		this.numEdition = numEdition;
	}
	

	@Override
	public String toString() {
		return "Book [nomOuvrage=" + nomOuvrage + ", nomAuteur=" + nomAuteur + ", numEdition=" + numEdition + ", codeBarre=" + codeBarre + "]";
	}

}

