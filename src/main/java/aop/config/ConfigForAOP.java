package aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("aop")
@EnableAspectJAutoProxy
@PropertySource("classpath:aop")
public class ConfigForAOP {
}
