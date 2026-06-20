import java.util .*;

public class function2 {

    public static int calculateSum(int A, int B) {
        int sum = A + B;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            System.out.print("A:- ");
            int A = sc.nextInt();
            
            System.out.print("B:- ");
            int B= sc.nextInt();
            


            int sum = calculateSum(A, B);
            System.out.println("Sum of A,B is:- "+ sum);
    }
}