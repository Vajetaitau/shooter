package shooter.root.dao;

import org.springframework.data.repository.CrudRepository;
import shooter.root.entities.User;

/**
 * Created by karol on 10/16/2016.
 */
public interface UserDao extends CrudRepository<User, Integer> {
}
