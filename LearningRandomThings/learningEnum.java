package LearningRandomThings;
public class learningEnum {

    //enums are lists of variables which you can use at the top of the script
    //Each variable is called a numeration constant
    enum Transport{
        PLANE(600), TRAIN(80), AUTOMOBILE(50);

        int speed;

        Transport(int s) {
            speed = s;
        }
    }

    public static void main(String[] args) {
    
        Transport allTransports [] = Transport.values();

        for (Transport t: allTransports) {
            System.out.println(t);
        }
    
        //Learning about static varibles in enum and how we can use them if we are repeatedly using within a code
        System.out.println(Transport.AUTOMOBILE.speed);


        //Learning that order sometimes matters in enum
        Transport tp = Transport.AUTOMOBILE;
        
        System.out.println(tp.ordinal());

    }
}