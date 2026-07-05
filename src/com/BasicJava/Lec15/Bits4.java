import java.util.*;

public class Bits4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read operation: 1 = set bit, 0 = clear bit
        System.out.print("Enter operation (1=set, 0=clear): ");
        int oper = sc.nextInt();

        // Example number and position. Change as needed or read from input.
        int n = 5; // binary: 0101
        int pos = 1;

        int bitMask = 1 << pos;

        if (oper == 1) {
            // set bit
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else if (oper == 0) {
            // clear bit
            int newBitMask = ~bitMask;
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        } else {
            System.out.println("Invalid operation: use 1 (set) or 0 (clear)");
        }

        sc.close();
    }
}