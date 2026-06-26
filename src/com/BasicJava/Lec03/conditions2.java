package src.com.BasicJava.Lec03;
// check two no are equal or not
// check A is greater than B or not
// check A is less than B or not
// using if, if else condition

import java.util.*;

public class conditions2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A:- ");
        int A = sc.nextInt();

        System.out.println("B:- ");
        int B = sc.nextInt();

        if(A==B){
            System.out.print("A and B are equal");
        }else{
            if(A>B){
                System.out.println("A is greater than B");
            }else{
                if(A<B){
            System.out.println("A is less than B");
                }
            }
        }
    }
    
}

