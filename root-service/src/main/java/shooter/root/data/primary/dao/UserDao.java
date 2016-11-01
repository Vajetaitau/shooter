package shooter.root.data.primary.dao;

import org.springframework.data.repository.CrudRepository;
import shooter.root.data.primary.entities.User;

/**
 * Created by karol on 10/16/2016.
 */
public interface UserDao extends CrudRepository<User, Integer> {
}
