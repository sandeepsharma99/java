package Arrays;

import java.util.Scanner;

public class Searching {
    public static int LinearSearch(int[] arr, int find) {
        for(int i=0; i<arr.length;i++){
            if(arr[i]==find){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Find x: ");
        int find = sc.nextInt();
        int index = LinearSearch(arr, find);
        System.out.println(index);
        sc.close();
    }
}
