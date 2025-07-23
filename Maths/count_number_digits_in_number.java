import java.util.*;
public class count_number_digits_in_number {

    public static void main(String[] args) {
        int n;
        int count=0;
Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();

        while(n>0){ 
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}