package domain;


 /**
 * The class Dog extends predator
 */ 
public class Dog extends Predator {

    private String kind;


/** 
 *
 * Dog
 *
 * @param name  the name
 * @param weight  the weight
 * @param kind  the kind
 * @return public
 */
    public Dog(String name, int weight, String kind) { 

        this.kind=kind;
        this.weight=weight;
        this.kind=kind;
    }


/** 
 *
 * Dog
 *
 * @return public
 */
    public Dog() { 

        this("Blue", 45, "Ukraine");
    }


/** 
 *
 * Dog
 *
 * @param name  the name
 * @return public
 */
    public Dog(String name) { 

        this(name, 26, "Russian");
    }

    

/** 
 *
 * Play
 *
 */
    public void play() { 

    System.out.println("Dog is playing..");
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Dog hunting for a Fox");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Dog";
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

       System.out.println("Dog is sleping.");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

     System.out.println("Dog eating bone");
    }
    
    
}
