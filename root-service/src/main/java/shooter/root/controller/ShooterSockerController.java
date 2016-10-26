package shooter.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import shooter.root.details.ShooterMap;
import shooter.root.enums.MovementEnum;

/**
 * Created by karol on 10/21/2016.
 */
@Controller
public class ShooterSockerController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    private ShooterMap shooterMap;

    @MessageMapping("/hello")
    public void greeting(MovementEnum movementEnum) throws Exception {
        System.out.println(movementEnum);
        return;
    }

    @Scheduled(fixedRate = 1000)
    public void renderShooterMap() {
        simpMessagingTemplate.convertAndSend("/topic/greetings", shooterMap);
    }

}
