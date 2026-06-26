package src.com.BasicJava.Lec02;
//take input from user and print it with hello and name

import java.util.*;

public class input{
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
