import java.util.*;
public class math{

    public static int sum_digit(int num){
        int sum = 0;
        while (num!=0) {
            int rem = num%10;
            sum+=rem;
            num = num/10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // taking input from user 
        int num = sc.nextInt();
        int ans = sum_digit(num);
        System.out.println(ans);
        
        sc.close();
    }
}