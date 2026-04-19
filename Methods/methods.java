package Methods;

public class methods {
    static int value = 10;
    // method/function declaration
    // static void MultipleOfTwo(){
    //     for(int i = 1; i<=10; i++){
    //         System.out.println(2*i);
    //     }
    // }
    
    // static void printSum(int x, int y){
    //     int ans = x+y;
    //     System.out.println(ans);
    // }
    static int Multiply(int x, int y){
        
        int ans = x*y;
        
        return ans;
    }

    static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }

    static void detail(String name,int cgpa){
        System.out.println(name+" "+cgpa);
    }

    static void detail(String name, int cls, double cgpa){
        System.out.println(name+" "+cls+" "+cgpa);
    }

    public static void main(String[] args) {
        // function call
        // MultipleOfTwo();
        // printSum(5,10);
        boolean ans = isEven(10);
        System.out.println(ans);

        detail("sandeep", 10, 8.6);

        // int ans = Multiply(5,10);
        // System.out.println(ans);
        // System.out.println(value); // accessing variable from global scope
    }
}
