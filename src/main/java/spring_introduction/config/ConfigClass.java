package spring_introduction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring_introduction")
@PropertySource("classpath:spring_introduction")
public class ConfigClass {
}
