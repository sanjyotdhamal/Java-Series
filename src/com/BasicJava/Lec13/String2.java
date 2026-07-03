import java.util.*;

public class String2 {
    public static void main (String [] args){
        StringBuilder sb = new StringBuilder("Sanjyot");
        System.out.println(sb);

         //insert char at index 9 
        sb.insert(7,'D');
        System.out.println(sb);    //..>op = SanjyotD

        sb.insert(8,'h');
        System.out.println(sb);   //...>op = SanjyotDh

        //delete the extra 2,3
        sb.delete(2,4);
        System.out.println(sb);    //...> = SayotDh
    }
}