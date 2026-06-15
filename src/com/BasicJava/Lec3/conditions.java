//check your are adult or not 
//using if else condition

import java.util.*;
public class conditions {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");

        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You are adult");
        }else{
            System.out.println("You are not adult");
        }
    }
}
