 package ProjetWeb.ProjetWeb;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

	@org.springframework.data.annotation.Id
	private String nomOuvrage;
	private String nomAuteur;
	private String numEdition;
	private int codeBarre;
	private ArrayList<Pret> dates = new ArrayList<Pret>();
	
	public Book() {
		super();
	}
	
	public Book(String nomOuvrage, String nomAuteur, String numEdition, int codeBarre) {
		super();
		this.nomOuvrage = nomOuvrage;
		this.nomAuteur = nomAuteur;
		this.numEdition = numEdition;
		this.codeBarre = codeBarre;
	}

	public ArrayList<Pret> getDates() {
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
	
	public int getCodeBarre() {
		return codeBarre;
	}
	
	public void setCodeBarre(int codeBarre) {
		this.codeBarre = codeBarre;
	}

	@Override
	public String toString() {
		return "Book [nomOuvrage=" + nomOuvrage + ", nomAuteur=" + nomAuteur + ", numEdition=" + numEdition + ", codeBarre=" + codeBarre + "]";
	}

}

