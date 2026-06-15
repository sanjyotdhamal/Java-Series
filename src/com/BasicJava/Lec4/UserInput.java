import java.util.*;

public class UserInput {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter A:- ");
        int A = sc.nextInt();

        System.out.print("Enter B:-");
        int B = sc.nextInt();

        System.out.print("A+B:- "+ (A+B) );
    }
    
}
