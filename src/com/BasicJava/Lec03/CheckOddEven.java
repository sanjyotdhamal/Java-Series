package src.com.BasicJava.Lec03;
// check no is even or odd 
// using if else condition

import java.util.*;

public class CheckOddEven {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("No is even");
        }else{
            System.out.println("No is odd");
        }  
    }
}
