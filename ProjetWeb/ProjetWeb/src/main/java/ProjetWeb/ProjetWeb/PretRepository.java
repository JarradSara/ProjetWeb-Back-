package ProjetWeb.ProjetWeb;
import org.springframework.data.repository.CrudRepository;


	public interface PretRepository extends CrudRepository<Pret,Integer> {

		    public Pret findByIdpret(int idpret);
		    public void deleteById(int idpret);
			public Pret findByPret(String pret);

		}

