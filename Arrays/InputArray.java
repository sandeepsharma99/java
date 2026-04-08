package Arrays;
import java.util.*;
public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // case -> 1 given n element
        int n = sc.nextInt(); // taking size as an input
        int[] arr = new int[n]; // declaration
        
        // Taking input array element from user 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // printing array element
        for(int i : arr){
            System.out.print(i+ " ");
        }

        sc.close();

    }
}
