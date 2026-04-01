import java.util.*;

public class armstrongNumber {

    public static boolean isArmstrong(int num) {
        int n = num;
        int count = 0;

        // Count digits
        while (n != 0) {
            n = n / 10;   // ✅ fixed
            count++;
        }

        int sum = 0;
        n = num;

        // Calculate Armstrong sum
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n = n / 10;
        }

        return num == sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}