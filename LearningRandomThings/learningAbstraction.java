package LearningRandomThings;

//An abstract class helps to use normal classes
//An abstract method is a method that isn't implemented yet
//Used for conviences
abstract class Dog {
    String breed;

    public void bark() {
        System.out.println("Bark!");
    }

    //In this method it doesn't know what to do when you implement it
    public abstract void poop();
} 

//Chihuahua is an extension of dog and is an actual class which allows DOg to be used in static main
class Chihuahua extends Dog {
    public void poop() {
        System.out.println("Dogshit"); 
    }
}

public class learningAbstraction {
    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();

        c.bark();
        c.poop();
    }
}