package test;

import domain.Dog;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public void main(String[] args) { 

        Dog dog = new Dog("Elic");
        boolean Dog = false;
        System.out.println(Dog);
        dog.eat();
        dog.hunt();
        dog.play();
        dog.sleep();
    }
}
