package ProjetWeb.ProjetWeb;

	import java.util.ArrayList;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import org.springframework.http.HttpStatus;

	@RestController
	public class PretBookService {

		//private List<Book> books = new ArrayList<Book>();
		@Autowired
		BookRepositorySQL bookRepositorySQL; 

		public PretBookService(){
			
		}
		

		@RequestMapping(value="/books", method=RequestMethod.GET) 
		@ResponseStatus(HttpStatus.OK) 
		public Iterable<BookSQL> getListOfBooks(){
			return bookRepositorySQL.findAll();  
		} 

		@RequestMapping(value = "/books", method = RequestMethod.POST	)
		@ResponseStatus(HttpStatus.OK)
		public void addBook(@RequestBody BookSQL book) throws Exception{

			BookSQL bookSQL = new BookSQL(book.getNomOuvrage(), book.getNomAuteur(), book.getNumEdition(), book.getCodeBarre());
			bookRepositorySQL.save(bookSQL);
		}

		@RequestMapping(value = "/books/{codeBarre}", method = RequestMethod.GET) 
		@ResponseStatus(HttpStatus.OK)
		public BookSQL getBook(@PathVariable(value = "codeBarre") int codeBarre){
			BookSQL book = bookRepositorySQL.findByCodeBarre(codeBarre);
			return book;

		}
		
		@RequestMapping(value = "/books/{codeBarre}", method = RequestMethod.PUT)
		@ResponseStatus(HttpStatus.OK)
		/*public Book pretBook(@PathVariable(value = "nomOuvrage") String nomOuvrage,
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
		
	 	public void updateBook(@RequestBody BookSQL book) throws Exception{
			BookSQL bookSQL = new BookSQL(book.getNomOuvrage(), book.getNomAuteur(), book.getNumEdition(), book.getCodeBarre());
			bookRepositorySQL.save(bookSQL);
		} 
		

		  @RequestMapping(value = "/books/{codeBarre}", method = RequestMethod.DELETE)
		@ResponseStatus(HttpStatus.OK)
		public void getBack(@PathVariable(value="codeBarre") int codeBarre) throws Exception{
			System.out.println(codeBarre);
			bookRepositorySQL.deleteById(codeBarre); 
		} 
			
	
} 
			
			
			
	

