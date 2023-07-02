package LearningRandomThings;
public class learningtoReturn {
    //I learned that this is technically the first method - the 'main' method
    public static void main(String[] args) {
        ilikechocolate();
        int addition = add(9,10);
        System.out.println(addition);
        String shouting = caps("what are you doing in my room son");
        System.out.println(shouting);
        int[] PrintedArray = gimmeArrayFromInts(9,10,21);
        
        //You can't print out arrays like this, probably best to do by elements
        System.out.println(PrintedArray);

    }

    //This is another method which will not run in the main method unless I have it within the main method curly brace
    public static void ilikechocolate() {
        System.out.println("I like to eat chocolate in the morning"); 
        return;     
    }

    //The 'void' in public static void is used to describe the fact that nothing will be returned
    //So if I want the sum to be called back into the main sum again then change the void and 'return' the statement like C
    public static int add(int a, int b) {
        return a + b;
    }

    public static String caps(String s) {
        return s.toUpperCase();
    }

    public static int[] gimmeArrayFromInts(int a , int b, int c) {
        int[] storageArray = new int[3];
        storageArray [0] = a;
        storageArray [1] = b;
        storageArray [2] = c;
        return storageArray;
    }
}