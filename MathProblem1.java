// sum of prime num

import java.util.*;
public class MathProblem1 {
    public static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean sumPrime(int num) {
        for(int i=2; i<num; i++){
            if(isPrime(i) && isPrime(num-i)){
                System.out.println(i+" "+(num-i));
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(sumPrime(num)){
            System.out.println("yes there is sum of prime ");
        }else{
            System.out.println("NO Ther is no");
        }
        sc.close();
    }
}
