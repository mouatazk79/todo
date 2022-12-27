package klaa.mouataz.simpletodo.services.impl;

import klaa.mouataz.simpletodo.model.Todo;
import klaa.mouataz.simpletodo.repositories.TodoRepository;
import klaa.mouataz.simpletodo.services.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public Todo getTodo(Long id) {
        return todoRepository.findTodoById(id);
    }

    @Override
    public List<Todo> getTodos() {

        return todoRepository.findAll();
    }

    @Override
    public void saveTodo(Todo todo) {
       todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
       todoRepository.deleteTodoById(id);
    }
}
