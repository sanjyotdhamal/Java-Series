import java.util.*;

public class String1 {
    public static void main (String [] args){
        StringBuilder sb = new StringBuilder("Sanjyot");
        System.out.println(sb);

        //find char at index 0
        System.out.println("Char at 0 is:- " + sb.charAt(0));

        //change char from index 0 to M
        sb.setCharAt(0,'M');
        System.out.println(sb);


    }
}
