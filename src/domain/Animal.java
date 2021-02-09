package domain;

public class Animal {

    protected String name;

    protected int weight;

    public Animal() {
        name="generic animal";
        weight=40;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Speaking");
    }

    @Override
    public String toString() {
        return "Animal:" + "name=" + name + ", weight=" + weight + '}';
    }

    
}
