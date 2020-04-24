package ProjetWeb.ProjetWeb;

	import java.util.ArrayList;
	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import org.springframework.http.HttpStatus;

	@RestController
	public class AdherantService {


		@Autowired
		AdherantRepositorySQL adherantRepositorySQL; 

		public AdherantService(){
			
		}
		

		
		@RequestMapping(value="/adherants", method=RequestMethod.GET) 
		@ResponseStatus(HttpStatus.OK) 
		public Iterable<AdherantSQL> getListOfAdherants(){
			return adherantRepositorySQL.findAll(); 
		}
		
		
		@RequestMapping(value = "/adherants", method = RequestMethod.POST	)
		@ResponseStatus(HttpStatus.OK)
		public void addAdherant(@RequestBody AdherantSQL adherant) throws Exception{

			AdherantSQL adherantSQL = new AdherantSQL(adherant.getIdAdherant(),adherant.getNomAdherant(), adherant.getPrenomAdherant(), adherant.getAgeAdherant(), adherant.getEmailAdherant(), adherant.getAdresseAdherant());
			adherantRepositorySQL.save(adherantSQL);
		}

		
		@RequestMapping(value = "/adherants/{idAdherant}", method = RequestMethod.GET) 
		@ResponseStatus(HttpStatus.OK)
		public Optional<AdherantSQL> getAdherant(@PathVariable(value = "idAdherant") int idAdherant){
			Optional<AdherantSQL> adherant = adherantRepositorySQL.findById(idAdherant);
			return adherant;
			
		}
		
		@RequestMapping(value = "/adherants/{idAdherant}", method = RequestMethod.PUT)
		@ResponseStatus(HttpStatus.OK)
		/*public Book pretBook(@PathVariable(value = "codeBarre") int codeBarre,
						   @RequestParam(value = "pret", required = false) boolean pret,
						   @RequestBody Pret dates){
			for(Book book: books){
				if(book.getNomOuvrage().equals(nomOuvrage)){
					if(pret == true){
						book.getDates().add(dates);
					} else {
						book.getDates().remove(dates);
					}
					return book;
				}
			}
	
			return null;
		}  */
		
		public void updateAdherant(@RequestBody Adherant adherant) throws Exception{
			AdherantSQL adherantSQL = new AdherantSQL(adherant.getIdAdherant(),adherant.getNomAdherant(), adherant.getPrenomAdherant(), adherant.getAgeAdherant(), adherant.getEmailAdherant(), adherant.getAdresseAdherant());
			adherantRepositorySQL.save(adherantSQL);
		} 
		

		
		  @RequestMapping(value = "/adherants/{idAdherant}", method = RequestMethod.DELETE)
		@ResponseStatus(HttpStatus.OK)
		public void getBack(@PathVariable(value="idAdherant") int idAdherant) throws Exception{
			System.out.println(idAdherant);
			adherantRepositorySQL.deleteById(idAdherant); 
		} 
			
	
} 
			
			
			
	

