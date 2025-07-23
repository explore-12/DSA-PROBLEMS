package Maths;
import java.util.*;
public class gcd_euclid_algorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        int maxx_diff;
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
      int   m=Math.min(a,b);
        while(m>=1){
        if(a==b){
            System.out.println(a);
            break;
        }

        if(a>b){
            maxx_diff=a-b;
            a=maxx_diff;
            m=a;

        }
        else{
            maxx_diff=b-a;
            b=maxx_diff;
            m=b;
        }
        }

System.out.println(m);
    }
}
