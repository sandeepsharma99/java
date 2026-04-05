import java.util.Scanner;

public class array {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // int arr[]; // declare
    // arr = new int[3]; // memory allocation
    // arr[0] = 10;
    // int a[]=new int[3];
    // int[] b = new int[3];
     // int[] c = {1,2,3,4,5,6,7,8,9}; //creating array with value
    // System.out.println(arr);
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);



    // for loop over array
    // for (int i=0; i<c.length; i++){
    //     System.out.println(i);
    // }
    // for(int i : c){
    //     System.out.print(i+" ");
    // }

    // Taking input from user
    System.out.println("enter the length of array");
    int n = sc.nextInt();
    int[] arr = new int[n]; //declaring and creaing array
    System.out.println("enter array item");
    // Taking input using loop
    for(int i=0; i<arr.length; i++){
       int a = sc.nextInt();
        arr[i] = a;
    }
    System.out.println("Given array");
    // looping on array
    for (int i : arr) {
        System.out.print(i+" ");
    }
    int ans = sum_arr(arr);
    System.out.println();
    System.out.println(ans);

    sc.close();

    }

    public static int sum_arr(int[] arr) {
        int ans = 0;
        for(int i: arr){
            ans += i;
        }
        return ans;
    }
}



