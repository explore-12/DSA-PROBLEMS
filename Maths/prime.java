package Maths;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        int num;
Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        boolean prime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
            if(prime){
                System.out.println("prime number");
            }
            else{
                System.out.println("not prime");
            }
        
    }
}
