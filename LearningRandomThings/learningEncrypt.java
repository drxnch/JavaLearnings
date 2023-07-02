package LearningRandomThings;
public class learningEncrypt {
    public static void main(String[] args) {
        
        String text = "Hello World";
        System.out.println(text);
        
        int key = 6;
        char[] chars = text.toCharArray();

        for (char c : chars) {
            c += key;
            //You can do sysout without 'ln' to print on the same line
            System.out.print(c);
        }
        





        
        
    }
}
