package LearningRandomThings;
public class learningStringsandMethods {
    public static void main(String[] args) {
        
        //A string is
        String name = "Chronical";

        
        System.out.println("Name: " + name);
        
        //A method is a fancy word for a word that does one task

        //The following method takes your string and does a fancy task, aka. uppercase:
        System.out.println("Name in uppercase: " + name.toUpperCase());

        //Other Useful Ones to know
        System.out.println("Name in uppercase: " + name.toLowerCase());
        System.out.println("Name in lowercase: " + name.charAt(3));
        System.out.println("Name length: " + name.length());
        System.out.println("Name in uppercase: " + name.substring(4,6));

        //Personal hw, trying to make the following string in a more formal format

        String word = "IrIdocYcLitis";
        String firstletter = word.substring(0,1);
        String restOfWord = word.substring(1,word.length());
        String FormalWord = firstletter.toUpperCase() + restOfWord.toLowerCase();
        System.out.println("Formal formatting practice: " + firstletter.toUpperCase() + restOfWord.toLowerCase());
        System.out.println(FormalWord);
    }
}