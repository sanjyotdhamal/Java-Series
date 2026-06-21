//Multiplication of A anda B in function 

import java.util .*;

public class function3 {

    public static int Multiply(int A, int B) {
        int Multiplication = A * B;
        return Multiplication;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            System.out.print("A:- ");
            int A = sc.nextInt();
            
            System.out.print("B:- ");
            int B= sc.nextInt();

            int sum = Multiply(A, B);
            System.out.println("multiplication of A,B is:- "+ sum);
    }
}