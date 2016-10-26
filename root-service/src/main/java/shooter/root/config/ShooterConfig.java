package shooter.root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import shooter.root.details.ShooterMap;

import java.util.HashSet;

/**
 * Created by karol on 10/23/2016.
 */
@Configuration
public class ShooterConfig {

    @Bean
    public ShooterMap shooterMap() {
        return new ShooterMap(new HashSet());
    }
}
