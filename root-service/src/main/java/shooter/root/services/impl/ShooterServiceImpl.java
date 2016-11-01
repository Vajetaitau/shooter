package shooter.root.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shooter.root.data.secondary.dao.ShooterDao;
import shooter.root.data.secondary.entities.Shooter;
import shooter.root.details.ShooterDetails;
import shooter.root.services.ShooterService;

/**
 * Created by karol on 11/1/2016.
 */
@Service
@Transactional(rollbackFor = {Throwable.class})
public class ShooterServiceImpl implements ShooterService {

    @Autowired
    private ShooterDao shooterDao;

    @Override
    public ShooterDetails save(ShooterDetails shooterDetails) {
        Shooter shooter = new Shooter(null, shooterDetails.getName());
        shooter = shooterDao.save(shooter);
        return new ShooterDetails(45, 45, shooter.getName());
    }
}
