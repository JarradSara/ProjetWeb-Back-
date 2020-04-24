package ProjetWeb.ProjetWeb;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositorySQL extends CrudRepository<BookSQL, Integer> { 
	
	public void deleteByCodeBarre(int codeBarre);
	public BookSQL findByCodeBarre(int codeBarre);
	public BookSQL findByNomOuvrage(String nomOuvrage);
}
