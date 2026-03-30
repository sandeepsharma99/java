import java.util.*;
public class sannerinput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // integer
        int num = sc.nextInt();
        // string
        sc.nextLine();
        String s = sc.nextLine();
        // float
        float f = sc.nextFloat();
        // double
        double d = sc.nextDouble();
        // character
        char c = sc.next().charAt(0);

        System.out.println(num+" "+s+" "+f+" "+d+" "+c);

    }
}