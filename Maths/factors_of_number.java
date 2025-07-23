
import java.util.*;

public class factors_of_number {
public static void main(String[] args) {
    int n;
    int i=2;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number");
    n=sc.nextInt();

    while(i*i<=n)
    {
        while(n%i==0){
            System.out.println(i);
            n=n/i;
        }
        i++;
    }

    if(n>1){
        System.out.println(n);
    }
}
}