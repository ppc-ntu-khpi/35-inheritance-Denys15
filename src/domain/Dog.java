package domain;

public class Dog extends Predator {

    private String kind;

    public Dog(String name, int weight, String kind) {
        this.kind=kind;
        this.weight=weight;
        this.kind=kind;
    }

    public Dog() {
        this("Blue", 45, "Ukraine");
    }

    public Dog(String name) {
        this(name, 26, "Russian");
    }

    
    public void play() {
    System.out.println("Dog is playing..");
    }

    @Override
    public void hunt() {
        System.out.println("Dog hunting for a Fox");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Dog";
    }

    @Override
    public void sleep() {
       System.out.println("Dog is sleping.");
    }

    @Override
    public void eat() {
     System.out.println("Dog eating bone");
    }
    
    
}
