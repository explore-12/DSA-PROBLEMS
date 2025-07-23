package Maths;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
int a,b,min,i;
System.out.println("enter the first number");
a=sc.nextInt();
System.out.println("enter the second number");
b=sc.nextInt();

if(a>b){
  min=b;
}
else{
  min=a;
}

System.out.println("min value="+min);

for(i=min;i>=1;i--)
{
  if((a%i==0) && (b%i==0)){
      System.out.println(i);
      break;
  }
//  break;
  
}
// System.out.println(i);

    }
}

