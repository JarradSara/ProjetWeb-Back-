package ProjetWeb.ProjetWeb;

import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pret {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idpret;
	private Date pret;
    private Date retour;
	@ManyToOne
    @JoinColumn(name = "book", nullable = false)
    BookSQL book;
    
    @ManyToOne
    @JoinColumn(name = "adherent", nullable = false)
    AdherantSQL adherant; 
    public Pret() {
		super();
	}
    
    public Pret(int idpret) {
    	this.idpret = idpret;
    }
    
    
    public Pret(Date d1, Date d2) {
		super();
		this.pret = d1;
		this.retour = d2;
	}

	
	public int getIdpret() {
		return idpret;
	}
	public void setIdpret(int idpret) {
		this.idpret = idpret;
	}
	
	
	public BookSQL getBook() {
		return book;
	}
	public void setBook(BookSQL book) {
		this.book = book;
	}
	
	
	public AdherantSQL getAdherant() {
		return adherant;
	}

	public void setAdheran(AdherantSQL adherant) {
		this.adherant = adherant;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pret dates = (Pret) o;
        return pret.equals(dates.pret) &&
        		retour.equals(dates.retour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pret, retour);
    }

    public Date getPret() {
        return pret;
    }

    public void setPret(Date pret) {
        this.pret = pret;
    }

    public Date getRetour() {
        return retour;
    }

    public void setRetour(Date retour) {
        this.retour = retour;
    }
}

