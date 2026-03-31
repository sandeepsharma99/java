import java.util.Scanner;

public class allPimeFactor {

    public static boolean isPrime(int num){
        if(num <= 1){  // check if a number is less than 1 or not
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){  // loop from 2 to square root of numb
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void prime_Factor(int num){
        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
                if(num / i != i && isPrime(num / i)){
                    System.out.print(num / i + " ");
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Yes it is a prime no");
        } else {
            System.out.println("Not a prime no");
        }

        System.out.print("Prime factors: ");
        prime_Factor(num);

        sc.close();
    }
}