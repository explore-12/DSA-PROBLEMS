import java.util.Scanner;

public class Count_Number_Digits {

    static int count(long num){

        if(num==0){
            return 0;
        }

        return count(num/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        System.out.println("enter the number ");
        num=sc.nextLong();

        System.out.println(count(num));


    }
}
