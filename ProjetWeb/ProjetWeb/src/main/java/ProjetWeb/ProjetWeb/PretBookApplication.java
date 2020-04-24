package ProjetWeb.ProjetWeb;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
public class PretBookApplication implements CommandLineRunner {
	
	@Autowired
	BookRepositorySQL bookRepository;
	@Autowired
	AdherantRepositorySQL adherantRepository;
	@Autowired
	PretRepository pretRepository;

	public static void main(String[] args) {
		SpringApplication.run(PretBookApplication.class, args);
	}

	public void run(String... arg0) throws Exception{
		BookSQL book = new BookSQL("Les miserables", "FTPP", "FLM2012", 30138910);
		Pret pret = new Pret();
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date debut = dateFormat.parse("2020-10-09");
			Date retour = dateFormat.parse("2020-10-12");
			pret.setPret(debut);
			pret.setRetour(retour);
			AdherantSQL adherant = new AdherantSQL(139830, "JARRAD", "SARA", 22, "jarrasara98@gmail.com", "hay les roses");
			adherantRepository.save(adherant);
			bookRepository.save(book);
			pret.setBook(book);
			pret.setAdheran(adherant);
			//pretRepository.save(pret);
			
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	}
}
