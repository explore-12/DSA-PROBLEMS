// package recursion;

import java.util.Scanner;

public class num_till_10 {

    static void fun(int num){
        
        if(num<1){
            return ;
        }
System.out.println(num);
        fun(num-1);
    }
    public static void main(String[] args) {
        
        int num;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
            fun(num);

    }
}
