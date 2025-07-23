// package Maths;

import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number");
        n=sc.nextInt();
// int i=2;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }


    }
}
