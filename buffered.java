import java.io.*;
public class buffered{
    public static void main(String[] args)throws IOException{
        // input taking method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // string input
        // String name = br.readLine();
        // System.out.println(name);

        // number input
        int number = Integer.parseInt(br.readLine());
        System.out.println(number);

    }
}