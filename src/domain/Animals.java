package domain;

public class Animals {

    protected String name;

    protected int weight;

    public Animals() {
        name="Generic animal";
        weight=15;
    }

    public void eat() {
        System.out.println("Animals eating");
    }

    public void speak() {
        System.out.println("Animals speaking");
    }

    @Override
    public String toString() {
        return "Animals:" + "\name:\t" + name + ", weight:\t" + weight + '}';
    }

   
}
