package shooter.root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by karol on 10/17/2016.
 */
@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurerAdapter forwardToIndex() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                // forward requests to /private and /user to their index.html
                registry.addViewController("/p").setViewName(
                        "forward:/private/index.html");
                registry.addViewController("/").setViewName(
                        "forward:/guest/index.html");
            }
        };
    }

}
