//Qs. Take a matrix as input from the user. Search for a
//given number x and print the indices at which it occurs. ---> indices means printing rows and columns 

import java.util.*;

public class TwoDarray2 {
    public static void main (String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:-");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns:-");
        int cols = sc.nextInt();


        int[][] numbers = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
    }
}

        System.out.print("Enter the number to search:-");
        int x = sc.nextInt();

        //searching for the number
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("The number is found at index:- " + i + " " + j);
                }
            }
        }
    }
}
