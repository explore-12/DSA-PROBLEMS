// package recursion;
import java.util.*;

public class fibonaciiseries {

    static int fibonacii(int n){

        if(n==1 || n==2){
            return 1;
        }

        return fibonacii(n-1)+fibonacii(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of fibonacii series");
        n=sc.nextInt();

        System.out.println(fibonacii(n));
    }
    
}
