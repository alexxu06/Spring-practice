package prac1.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private Parrot parrot;

    @Autowired
    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Parrot getParrot() {
        return this.parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
