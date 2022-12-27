package klaa.mouataz.simpletodo.controller;

import klaa.mouataz.simpletodo.model.Person;
import klaa.mouataz.simpletodo.model.Todo;
import klaa.mouataz.simpletodo.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Todo")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable Long id){
        return todoService.getTodo(id);
    }
    @GetMapping("/all")
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }
    @PostMapping("/save")
    public void saveTodo(@RequestBody Todo todo){
        todoService.saveTodo(todo);
    }
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
    }
}
