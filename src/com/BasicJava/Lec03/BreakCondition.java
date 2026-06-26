package src.com.BasicJava.Lec03;
// Break Condition Q
// check button is 1,2,3 or not
// using switch/break case condition
 
import java.util.*;
public class BreakCondition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Button (1,2,3)");
        int Button = sc.nextInt();

        switch(Button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Nameste");
                break;
            case 3:
                System.out.println("Ram Ram mandali...!");
                break;
            default:
                System.out.println("Invalid Button");
        }

    }
    
}
