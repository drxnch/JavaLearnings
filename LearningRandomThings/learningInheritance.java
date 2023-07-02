package LearningRandomThings;
public class learningInheritance {

    //Exmaple is learning to create different types of gaming mice
    //Seeing the mice properties on the other 'learningInheritanceMouse_' this would be a very tedious process to repeat
    //Especially when most mice have similar properties that can be repeated as well

    //Instead, we can create a 'generic' mouse which then extends its properties onto the special mice

    public static void main(String[] args) {
        learningInheritanceMouse1 m1 = new learningInheritanceMouse1();
        learningInheritanceMouse2 m2 = new learningInheritanceMouse2();
        learningInheritanceMouse3 m3 = new learningInheritanceMouse3();

        m2.scrollUp();
        m3.rightClick();
        m1.texture();
    }
}