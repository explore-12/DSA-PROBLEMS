import java.util.*;
public class prime {
    public static void main(String[] args) {
        int num;
Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        for(int i=2;i<=num;i++){
            if(checkprime(num))
        }
    }
}
