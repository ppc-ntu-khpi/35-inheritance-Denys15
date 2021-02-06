package domain;

public class Cat extends Predator {

    private String kind;

    public Cat(String name, int weight, String kind) {
    this.name=name;
    this.weight=weight;
    this.kind=kind;
    }

    public Cat() {
        this("Grag", 13, "China");
        
    }

    public Cat(String name) {
        this(name, 7, "Japan");
    }
    
    public void play() {
    System.out.println("Cat is playing");
    }

    @Override
    public void hunt() {
        System.out.println("Cat is hunting for mouse");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Cat!"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void speak() {
        System.out.println("Weow");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        System.out.println("Cat eating meet"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
