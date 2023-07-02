package LearningRandomThings;
//I want to use continue to skip something
//These are useful in loops (for, while, etc. etc.)

public class learningContinue {
    public static void main(String[] args) {

        for (int i = 0; i <= 10 ; i++) {
            if (i == 2) {
                System.out.println("Tolu despises the number 2");
                continue;
            }
            if (i == 4) {
                System.out.println("Peter and I hate the number 4");
                continue;
            }
            System.out.println(i);
        }

    }
}