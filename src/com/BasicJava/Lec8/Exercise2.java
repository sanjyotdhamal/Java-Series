//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class Exercise2 {
    public static void printGreatestNo(int a, int b ){

        int greatestNo;

        
        if (a > b) {
                greatestNo = a;
            } else {
                greatestNo = b;

}       
            System.out.print("Greatest number is: "+greatestNo );
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:- ");
        int A = sc.nextInt();

        System.out.print("B:- ");
        int B = sc.nextInt();

        printGreatestNo (A, B);


        }
}
