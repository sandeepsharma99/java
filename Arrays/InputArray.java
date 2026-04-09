package Arrays;
import java.util.*;
public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // case -> 1 given n element
        // int n = sc.nextInt(); // taking size as an input
        // int[] arr = new int[n]; // declaration
        
        // inserting element 
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt(); //Taking input array element from user 
        // }
        // printing array element
        // for(int i : arr){
        //     System.out.print(i+ " ");
        // }

        // Taking String Input
        
        String input =  sc.nextLine();
        String ar[]= input.split(",");

        ArrayList<Integer>part = new ArrayList<>();
        for(String token : ar){
            int num = Integer.parseInt(token);
            part.add(num);
        }

        for(int i : part){
            System.out.print(i +" ");
        }

        sc.close();
    }
}

// commenting
