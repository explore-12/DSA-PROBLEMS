import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int a,b,i,j;

        Scanner sc=new Scanner(System.in);


        System.out.println("enter the first number");
        
        a=sc.nextInt();
        
        System.out.println("enter the second number");
        b=sc.nextInt();

       int  max=Math.max(a, b);
    //    i=max+1;
       while(true){
        if(max%a==0 && max%b==0){
            // System.out.println(max);
            break;
        }
        max++;
       }
    System.out.println(max);
   

    }
}
