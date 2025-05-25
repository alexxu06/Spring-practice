package prac1.config;

import prac1.main.Parrot;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "prac1")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

//    @Bean
//    public Person person(@Qualifier("parrot1") Parrot parrot) {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot);
//        return p;
//    }

}
