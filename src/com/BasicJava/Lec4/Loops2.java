//print the table of a no. input by the user 

import java.util.*;
public class Loops2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("N:- ");
        int n = sc.nextInt();
        System.out.println("Table of N");

        for(int i=1; i<11; i++){
            System.out.println(i*n);

        }

    }
    
}
