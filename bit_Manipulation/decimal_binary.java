// package bit_Manipulation;

import java.util.Scanner;

public class decimal_binary {

static String deci(int n){
  String b=" ";
    while(n>0){
        int x=n%2;
        n=n/2;
        b=x+b;
    }
    return b;
}
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();

        System.out.println(deci(n));



    }
    
}
