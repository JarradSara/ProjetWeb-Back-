package ProjetWeb.ProjetWeb;


public class PretJsonData {

	int idpret;
    String begin;
    String end;
    String adherant;
    String book;
    
    public int getIdpret() {
		return idpret;
	}


	public void setIdpret(int idpret) {
		this.idpret = idpret;
	}


	public PretJsonData() {
    	
    }
    
    
	public PretJsonData(String begin, String end, String adherant, String book,int idpret) {
		
		super();
		this.begin = begin;
		this.end = end;
		this.adherant = adherant;
		this.book = book;
		this.idpret = idpret;
	}


	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getAdherant() {
		return adherant;
	}
	public void setAdherant(String adherant) {
		this.adherant = adherant;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}

}