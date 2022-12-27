package klaa.mouataz.simpletodo.services;

import klaa.mouataz.simpletodo.model.Todo;

import java.util.List;

public interface TodoService {
    Todo getTodo(Long id);
    List<Todo> getTodos();
    void saveTodo(Todo todo);
    void deleteTodo(Long id);
}
