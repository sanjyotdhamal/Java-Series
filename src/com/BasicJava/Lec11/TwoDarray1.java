//to print 2D array 

import java.util.*;

public class TwoDarray1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:- ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns:- ");
        int cols = sc.nextInt();

        int [] [] numbers = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt(); 
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println (numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
