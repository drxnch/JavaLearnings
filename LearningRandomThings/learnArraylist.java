package LearningRandomThings;
//For Arraylist, import this before projects always
import java.util.ArrayList;

public class learnArraylist {
    public static void main(String[] args) {
    
        String [] people = new String [5];
        people[0] = "Jamal";
        people[1] = "Tyrone";
        people[2] = "Jason";
        people[3] = "Tony";
        people[4] = "Jasmine";
        System.out.println(people);


        //This is useful for printing arrays
        //Arraylists are flexible in size and very easy to discard values from arraylist
        ArrayList TheCouch = new ArrayList();
        TheCouch.add("Jamal");
        TheCouch.add("Tyrone");
        TheCouch.add("Jasmine");
        TheCouch.add("Tony");
        TheCouch.add("Jason");
        System.out.println(TheCouch);

    }
}