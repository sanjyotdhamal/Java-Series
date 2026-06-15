// check button is pressed or not
// using if , if else condition

import java.util.*;

public class conditions3 {
     public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Button (1,2,3)");
        int Button = sc.nextInt();

        if(Button == 1){
            System.out.print("Hello");
        }else if(Button == 2 ){
                System.out.println("Nameste");
            }else if(Button == 3){
            System.out.println("Ram Ram mandali...!");
            }else{
                System.out.println("Invalid Button");
            }
        }
    }

    

