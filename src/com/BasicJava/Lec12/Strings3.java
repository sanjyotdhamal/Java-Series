//WAP to find the length of string

import java.util.*;

public class Strings3 {
    public static void main (String[] args) {
        String firstName= "sanjyot";
        String lastname="Dhamal";
        String fullname = firstName + " " + lastname;
       System.out.print(fullname . length());

//charAt
for(int i=0; i<fullname.length(); i++) {
System.out.println(fullname.charAt(i));
    }  
}
}