package ProjetWeb.ProjetWeb;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,String> {

    public Book findByCodeBarre(int codeBarre);

}

