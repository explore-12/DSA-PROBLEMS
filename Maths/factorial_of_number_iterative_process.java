import java.util.*;
public class factorial_of_number_iterative_process {
    public static void main(String[] args) {
        
        int n,i;
        int num=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the factorial number");
        n=sc.nextInt();

        for(i=1;i<=n;i++){

            num=i*num;

        }
        System.out.println(num);
    }
}
