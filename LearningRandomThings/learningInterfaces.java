package LearningRandomThings;
public class learningInterfaces {

    //Interfaces are normally done outside of the main class so that it can be implemented within the class
    //Interfaces are like 'outlines' for the code
    //Example is with a water bottle
    interface bottleInterface {
        String colour = "Blue";
        
        //This needs to be in the function and filled up
        void fillUp();
        void pourOut();
    }

    public class InterfaceExample implements bottleInterface{
        
        public static void main(String[] args) {
            System.out.println(colour); //It realises the 'colour' from the interface which is why no complication

            InterfaceExample ex = new InterfaceExample();
            ex.fillUp();
        }

        public void fillUp() {
            System.out.println("Lets gooooooo");
        }

        //I didn't do anything for pourout because I didn't want too
        //Disadcantage of an interface is that all the fucntions MUST be used.
        @Override
        public void pourOut() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'pourOut'");
        }
    }
}

//Idk why it's not letting me get another instance of InterfaceExample