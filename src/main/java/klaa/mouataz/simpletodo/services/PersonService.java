package klaa.mouataz.simpletodo.services;

import klaa.mouataz.simpletodo.model.Person;

import java.util.List;

public interface PersonService {
    Person getPerson(Long id);
    List<Person> getPersons();
    void savePerson(Person person);
    void deletePerson(Long id);
}
