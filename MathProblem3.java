//  GP(gemoteric progression)
import java.util.*;
public class MathProblem3 {
    public static void GP(int a, int r, int n) {
        for (int i=1; i<=n; i++){
            int temp = a*(int)Math.pow(r, i-1);
            System.out.print(temp+" , ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("begining number: ");
        int a = sc.nextInt();
        System.out.println("No of element: ");
        int n = sc.nextInt();
        System.out.println("common ratio: ");
        int r = sc.nextInt();
        GP(a,r,n);
        sc.close();
    }
}
