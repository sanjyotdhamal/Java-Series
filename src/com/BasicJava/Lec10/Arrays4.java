//Find the largest and smallest element in an array


public class Arrays4 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }                            //.....to find max element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }}                        //......to find min element

        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}