// package recursion;
import java.util.*;
public class n_natural {
    static void natural(int n){
        if(n==0){
            return ;
        }
        natural(n-1); //substract them 
       System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=sc.nextInt();
        natural(n);


    }
    
}
