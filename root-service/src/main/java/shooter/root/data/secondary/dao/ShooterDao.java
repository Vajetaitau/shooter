package shooter.root.data.secondary.dao;

import org.springframework.data.repository.CrudRepository;
import shooter.root.data.secondary.entities.Shooter;

/**
 * Created by karol on 11/1/2016.
 */
public interface ShooterDao extends CrudRepository<Shooter, Integer> {
}
