package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal;
    private Animal animal1;
    private Timer timer;



    @Autowired
    public AnimalsCage( @Qualifier("cat") Animal animal, @Qualifier("dog") Animal animal1, Timer timer) {
        this.animal = animal;
        this.animal1=animal1;
        this.timer=timer;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString() + ", " + animal1.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
        System.out.println(timer.getTime());
    }
}
