import java.util.*;

public class MathProblem2 {

    public static void PrintAP(int n,int a,int d) {
        
        for(int i=0; i<n; i++){
            a=a+d;
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        PrintAP(n, a, d);
        sc.close();
    }
}
