package ProjetWeb.ProjetWeb;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

	@RestController
	public class PretService {

		@Autowired
		PretRepository pretRepository; 
		@Autowired
		AdherantRepositorySQL adherantRepository;  
		@Autowired
		BookRepositorySQL bookRepository; 

		public PretService(){
			
		}
		

		@RequestMapping(value="/prets", method=RequestMethod.GET) 
		@ResponseStatus(HttpStatus.OK) 
		public List<PretJsonData> getListOfPrets(){
			Iterable<Pret> it = pretRepository.findAll();
			List<PretJsonData> lp = new ArrayList<PretJsonData>();
			Iterator<Pret> test = it.iterator();
			while(test.hasNext()) {
				Pret pret = test.next(); 
				lp.add(new PretJsonData(pret.getPret().getYear()+1900 + "-" + pret.getPret().getMonth() + "-" + pret.getPret().getDay(), 
					pret.getRetour().getYear()+1900 + "-" + pret.getRetour().getMonth() + "-" + pret.getRetour().getDay(), pret.getAdherant().getNomAdherant(),
					pret.getBook().getNomOuvrage() , pret.getIdpret()));
				
			}


			return lp;
		}
		
		
		@RequestMapping(value = "/prets", method = RequestMethod.POST	)
		@ResponseStatus(HttpStatus.OK)
		public void addPret(@RequestBody PretJsonData pretJsonData) throws Exception{
//		
			System.out.print(pretJsonData.getIdpret());
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
			System.out.print(pretJsonData.getBegin());
			System.out.print("test");

			Date debut = dateFormat.parse(pretJsonData.getBegin());
			Date retour = dateFormat.parse( pretJsonData.getEnd());
			
			Pret pret = new Pret(debut,retour); 
		
			BookSQL book = bookRepository.findByNomOuvrage(pretJsonData.getBook());
		
			AdherantSQL adherant = adherantRepository.findByNomAdherant(pretJsonData.getAdherant());
		
			System.out.println(adherant.getNomAdherant()); 
		
			pret.setAdheran(adherant); 
			pret.setBook(book);

			pretRepository.save(pret);
			System.out.println("ALL OPERATION IS OK"); 
		}
		
		

		@RequestMapping(value = "/prets/{idpret}", method = RequestMethod.GET) 
		@ResponseStatus(HttpStatus.OK)
		public PretJsonData getPret(@PathVariable(value = "idpret") int idpret){
			// f
			Pret pret = pretRepository.findByIdpret(idpret);
			return new 	 PretJsonData(pret.getPret().toString(), 
					pret.getRetour().toString(), pret.getAdherant().getNomAdherant(),
					pret.getBook().getNomOuvrage(),pret.getIdpret());
			
		}
		
		@RequestMapping(value = "/prets/{idpret}", method = RequestMethod.PUT)
		@ResponseStatus(HttpStatus.OK)
		/* public Book pretBook(@PathVariable(value = "nomOuvrage") String nomOuvrage,
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
		
		
			public void updatePret(@RequestBody PretJsonData pretJsonData) throws Exception{
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
				System.out.print(pretJsonData.getBegin());
				System.out.print("test");

				Date debut = dateFormat.parse(pretJsonData.getBegin());
				Date retour = dateFormat.parse( pretJsonData.getEnd());
				
				Pret pret = new Pret(pretJsonData.getIdpret()); 
				System.out.println("++++++++++++++++++++"+pret.getIdpret());
			
				pret.setPret(debut);
				pret.setRetour(retour);
			
				BookSQL book = bookRepository.findByNomOuvrage(pretJsonData.getBook());
			
				AdherantSQL adherant = adherantRepository.findByNomAdherant(pretJsonData.getAdherant());
			
				System.out.println(adherant.getNomAdherant());
			
				pret.setAdheran(adherant); 
				pret.setBook(book);

				pretRepository.save(pret);
				System.out.println("ALL OPERATION IS OK"); 
			}

		@RequestMapping(value = "/prets/{idpret}", method = RequestMethod.DELETE)
		@ResponseStatus(HttpStatus.OK)
		
		public void getBack(@PathVariable(value="idpret") int idpret) throws Exception{
			System.out.println(idpret);
			pretRepository.deleteById(idpret); 
			System.out.println("hiiiiiiiiii");
		} 
			
	
} 
			
			
			
	


