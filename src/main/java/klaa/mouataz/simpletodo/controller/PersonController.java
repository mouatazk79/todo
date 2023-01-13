package klaa.mouataz.simpletodo.controller;

import klaa.mouataz.simpletodo.model.Person;
import klaa.mouataz.simpletodo.services.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Person")
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable Long id){
     return personService.getPerson(id);
    }
    @GetMapping("/all")
    public List<Person> getPersons(){
        System.out.println(personService.getPersons());
        return personService.getPersons();
    }
    @PostMapping("/save")
    public void savePerson(@RequestBody Person person){
        personService.savePerson(person);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }
}
