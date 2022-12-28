package klaa.mouataz.simpletodo.bootsrtrapp;

import klaa.mouataz.simpletodo.enumerations.Gender;
import klaa.mouataz.simpletodo.model.Person;
import klaa.mouataz.simpletodo.model.Todo;
import klaa.mouataz.simpletodo.repositories.PersonRepository;
import klaa.mouataz.simpletodo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class bootstrap implements CommandLineRunner {
    private final PersonRepository personRepository;
    private final TodoRepository todoRepository;

    public bootstrap(PersonRepository personRepository, TodoRepository todoRepository) {
        this.personRepository = personRepository;
        this.todoRepository = todoRepository;
    }
    @Override
    public void run(String... args) throws Exception {
       // Todo todo1=new Todo(1L,"","",person1);
        //Person person1=new Person(1L,"k","", Gender.MALE,"","", Set.of(todo1));


    }
}
