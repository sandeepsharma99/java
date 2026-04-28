package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    // int arr[]; // declaration
    // arr = new int[5]; // allocation
    // int brr[] = {1,2,3};
    // System.out.println(brr.length);
    // for (int i=0; i<=brr.length-1;i++){
    //     System.out.println(brr[i]);
    // }
    // for each loopp

    // for(int val : brr){
    //     System.out.println(val);
    // }
    
    Scanner sc = new Scanner(System.in);
    // int [] arr = new int [5];
    // int n = arr.length;
    //     // Taking Input
    // for(int i =0; i<=n-1; i++){
    //     arr[i] = sc.nextInt();
    // }

    // // printing value of array  
    // for(int i: arr){
    //     System.out.println(i);
    // }

    //declaration + allocation     
    // int [] arr = new int[5];
    // int n = arr.length;
    // for(int i=0; i<=n-1; i++){
    //     System.out.println("enter you Five input :");
    //     arr[i] = sc.nextInt();
    // }
    // int sum = 0;
    // for(int v: arr){
    //     sum = v + sum;
    // }
    // System.out.println(sum);

    // find max value
    int arr[] =  {3,5,1,2,3,1,0,22,2};
    int min = 10;
    for(int v: arr){
        if(v<min){
            min = v;
        }
    }
    System.out.println(min);

    }
}

// comments 
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
