import java.util.Scanner;

public class PalindromeOrNot {

    public static boolean isPalindrome(int n){
        int num = n;
        int rev = 0;
        while (num!=0) {
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        if(rev == num){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
