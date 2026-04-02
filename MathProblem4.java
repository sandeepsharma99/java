
import java.util.*;
public class MathProblem4 {
    public static boolean isPerfectNumber(int num) {
        int sum = 1;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                sum+=i;
            }
            if(i!=num/i){
                sum+=(num/i);
            }
        }
        System.out.println(sum);
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPerfectNumber(num)){
            System.out.println("True........");
        }else{
            System.out.println("False......");
        }
        sc.close();
    }
}
