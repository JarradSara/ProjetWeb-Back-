package ProjetWeb.ProjetWeb;
import org.springframework.data.repository.CrudRepository;


	public interface AdherantRepository extends CrudRepository<Adherant,String> {

	    public Adherant findByAgeAdherant(int ageAdherant);

	}
