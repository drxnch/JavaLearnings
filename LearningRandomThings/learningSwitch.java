package LearningRandomThings;
//Learning to use switch instead of 'else if' multiples

public class learningSwitch {
    public static void main(String[] args) {
    int day = 2;

//This code would be used to work using a ton of else if statements
  //  if(day == 1) {
  //      System.out.println("Sunday");        
  //  }
  //  else if (day == 2) {
  //      System.out.println("Monday");
  //  }
  //  else if (day == 3) {
  //      System.out.println("Tuesday");
  //  }

    switch(day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
    }
    }
}