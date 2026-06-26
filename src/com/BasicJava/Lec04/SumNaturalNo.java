package src.com.BasicJava.Lec04;
// print the sum of first n Natural nn

import java.util.*;
public class SumNaturalNo {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No:- ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.print("Sum of Natural Number:- " + sum);
    }
}
