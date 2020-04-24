package ProjetWeb.ProjetWeb;
import org.springframework.data.repository.CrudRepository;

public interface AdherantRepositorySQL extends CrudRepository<AdherantSQL, Integer> {
	public void deleteByIdAdherant(int idAdherant);
	public AdherantSQL findByIdAdherant(int idAdherant);
	public AdherantSQL findByNomAdherant(String nomAdherant);
	}