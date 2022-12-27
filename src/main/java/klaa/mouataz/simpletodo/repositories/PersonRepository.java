package klaa.mouataz.simpletodo.repositories;

import klaa.mouataz.simpletodo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
    Person findPersonById(Long id);
    List<Person> findAll();
    void  deletePersonById(Long id);
}
