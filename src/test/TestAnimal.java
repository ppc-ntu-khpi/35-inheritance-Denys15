package test;

import domain.Cat;

public class TestAnimal {

    public void main(String[] args) {
        Cat cat = new Cat("Andrew");
        System.out.println(cat);
        cat.hunt();
        cat.eat();
        cat.speak();
        cat.play();
    }
}
