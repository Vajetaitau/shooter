package shooter.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shooter.root.details.ShooterDetails;
import shooter.root.services.ShooterService;

/**
 * Created by karol on 11/1/2016.
 */
@RestController
public class ShooterController {

    @Autowired
    private ShooterService shooterService;

    @RequestMapping(value = "/action/shooter", method = RequestMethod.POST)
    public void save(@RequestBody ShooterDetails shooterDetails) {
        shooterService.save(shooterDetails);
    }
}
