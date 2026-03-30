import java.util.Scanner;

public class isprime{

    public static boolean isprime(int num){
        for (int i=2; i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isprime(num)){
            System.err.println("Yes it is a prime no");
        }else{
            System.out.println("Not a prime No");
        }
        sc.close();

    }
}