package klaa.mouataz.simpletodo.repositories;

import klaa.mouataz.simpletodo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {
}
