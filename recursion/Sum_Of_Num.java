import java.util.Scanner;

public class Sum_Of_Num {
    static int digi(int num){
        if(num<=0){
            return 0;
        }
        return digi(num/10)+(num%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
       
        System.out.println("enter the number");
         num=sc.nextInt();
        System.out.println(digi(num));
    }
}
