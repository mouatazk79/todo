package klaa.mouataz.simpletodo.repositories;

import klaa.mouataz.simpletodo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {
    Todo findTodoById(Long id);
    List<Todo> findAll();
    void deleteById(Long id);
}
