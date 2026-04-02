import java.util.Scanner;

public class MathProblem5 {
    public static void powerOfNumber(int x , int n) {
        int a=1;
        while(n!=0){
            if (n%2==0) {
                n=n/2;
                x=x*x;
            }else{
                n=n-1;
                a*=x;
            }
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        powerOfNumber(x, n);
        sc.close();
    }
}
