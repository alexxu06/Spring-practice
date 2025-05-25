package prac2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"prac2.proxies", "prac2.services", "prac2.repositories"})
public class ProjectConfig {
}
