package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int weight;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name="generic animal";
        weight=40;
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Eating");
    }


/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Speaking");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal:" + "name=" + name + ", weight=" + weight + '}';
    }

    
}
