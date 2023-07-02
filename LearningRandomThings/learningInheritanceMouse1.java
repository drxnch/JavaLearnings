package LearningRandomThings;
//To 'extend' the properties that is within the general mouse, simply use '__ extends __'
public class learningInheritanceMouse1 extends learningInheritanceMouseGeneral{
//Creating a mouse that is matte, has left and right buttons and has RGB on it
    String texture = "Matte";

    //Now these are redundant cause the general mouse covers these already
    //public static void leftClick() {
    //    System.out.println("Click!");
    //}

    //public static void rightClick() {
    //    System.out.println("Click!");
    //}

    public static void setColour(String colour) {
        System.out.println(colour);
    }
}

//I actually dk why this isn't working