import java.util.*;
public class Reversing_string_Recursion {
    static String str(String s,String r,int i){
        if(i<0){
            return r; // it will return null
        }

        return str(s,r+s.charAt(i), i-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s;
        s=sc.next(); //it will read 

        System.out.println(str(s,"",s.length()-1));//pass str(string,empty string,length of string)
        //why length()-1 because it will starts from  if length=4 then (0,1,2,3)

    }
}