//Enter 3 numbers from the user & make a function to print their average.


import java.util.Scanner;


public class Exercise1 {
    public static void printAverage(int a, int b, int c) {
        double average = (a + b + c) / 3;
        System.out.println("Average of A,B,C is:- " + average);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:- ");
        int A = sc.nextInt();

        System.out.print("B:- ");
        int B = sc.nextInt();

        System.out.print("C:- ");
        int C = sc.nextInt();

        printAverage(A, B, C);
    }
}
