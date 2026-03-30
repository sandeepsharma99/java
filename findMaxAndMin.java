import java.util.Scanner;

public class findMaxAndMin {

    public static void max_min(int num){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (num!=0){
        int rem = num%10;
        max = Math.max(max,rem);
        min = Math.min(min,rem);
        num = num/10;
        }
        System.out.println(max+" "+min);
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        max_min(num);
        sc.close();

    }
}
