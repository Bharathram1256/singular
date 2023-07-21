import java.util.HashMap;
import java.util.Scanner;

public class singularElement {


    public static void arrayIn(int size,Scanner sc) {
        int arr[] = new int[size];
        // Scanner a = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        

    }

    
     public static void main(String[] args) {
        // user input array
        Scanner sc = new Scanner(System.in);

        // taking the size of an array as input.
        int size = sc.nextInt();

        // print the array
         arrayIn(size,sc);
    }
}
