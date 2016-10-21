package shooter.root.controller;

/**
 * Created by owner on 10/13/16.
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/greetings")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}