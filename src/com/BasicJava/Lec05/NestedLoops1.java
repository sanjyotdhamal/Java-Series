package src.com.BasicJava.Lec05;
//print pattern * in 4 rows and 5 columns using nested loops


public class NestedLoops1 {
    public static void main (String [] args){
        int n = 4;
        int m = 5;

        //outer lopp
        for (int i=1; i<=n; i++){
            //inner loop
            for(int j =1; j<=m; j++){
                System.out.print("*");
            }
                System.out.println("");
        }   
     } }
