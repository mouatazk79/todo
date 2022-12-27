package klaa.mouataz.simpletodo.services.impl;

import klaa.mouataz.simpletodo.model.Person;
import klaa.mouataz.simpletodo.repositories.PersonRepository;
import klaa.mouataz.simpletodo.services.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person getPerson(Long id) {
        return personRepository.findPersonById(id);
    }

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @Override
    public void savePerson(Person person) {
         personRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
      personRepository.deletePersonById(id);
    }
}
