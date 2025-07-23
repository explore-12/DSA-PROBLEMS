// package bit_Manipulation;

import java.util.Scanner;

public class binary_decimal {

    static String decitobinary(int n){

        String b="";

        while(n>0){
            int x=n%2;
            n=n/2;
            b=x+b; //in reverse order
        }

        return b;

    }

    static int  binarytodeci(String b){
        int pow=1;
        int result=0;

        for(int i=b.length()-1;i>=0;i--){
            //if you take b.length it will conisider 6 but the array will begin from 0-5;
            if(b.charAt(i)=='1'){
                result=result+pow; //it will work when there is only 1
                //if you give pow=pow*2 here the output will be 15
            }
            pow=pow*2;// for every loop it should add 
        }
return result;
    }
    public static void main(String[] args) {
        
        //decimal to binary

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
       String  b=decitobinary(n);
        System.out.println(b);
        System.out.println(binarytodeci(b));




    }
}
