import java.util.*;

public class Trailing_zeros_factriol { 
    public static void main(String[] args) {
        
        int i=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter then number");
        num=sc.nextInt();
       int  p=5;

        while (num>=p) {
            i=i+(num/p);  // to find zeros of a factriol are 200/5,200/25,200/125....
            p=p*5; //each time power must increse

            
        }
        System.out.println(i);
    }


}
