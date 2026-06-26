package src.com.BasicJava.Lec07;
//WAP to print given name in function 

import java.util.*;

public class function {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:- ");
        String name = sc.next();

        printMyName(name);  //        call kiya function ko 
    }
}
