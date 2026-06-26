package src.com.BasicJava.Lec05;
///WAP to print pattern 4*5 but only boundary *
/// *****
/// *   *
/// *   *
/// *****
/// 
public class NestedLoop3 {
    public static void main(String [] args){
        int n = 4;
        int m = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 ||i==n ||j==m || j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    
}
