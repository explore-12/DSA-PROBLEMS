package Maths;
import java.util.*;
public class prime_eratosthenes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,num,j;
        System.out.println("enter the n number that need to find prime ");
num=sc.nextInt();
        boolean[] arr=new boolean[num+1];

        for(i=2;i<=num;i++)
        {
            

            
            if(arr[i]==false && i<num){
                System.out.println(i);

                for(j=i*2;j<=num;j=j+i) //j=i*i can be given 
                {
                    arr[j]=true;

                }
            }
        }
        
    }
    
}