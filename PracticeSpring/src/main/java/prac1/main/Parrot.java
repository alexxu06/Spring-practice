package prac1.main;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

//@Component
public class Parrot {
    private String name;

//    @PostConstruct
//    public void init() {
//        this.name = "Koko";
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }

}
