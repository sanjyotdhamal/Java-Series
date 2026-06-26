package src.com.BasicJava.Lec06;
//WAP to print Butterfly Pattern

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *


import java.util.*;

public class Pattern1 {
    public static void main(String [] args){
        int n = 5;
        
        //upper Half
        for (int i=1; i<=n; i++){
            //1st Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //2nd Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //lower Half
            for (int i=n; i>=1; i--){
            //1st Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //2nd Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        
            System.out.println();
    
        }
}
}