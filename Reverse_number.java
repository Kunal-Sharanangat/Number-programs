import java.util.*;
public class Reverse_number {

    public static void main(String args[])
    {
        int num,rem,rev=0;

        System.out.println("enter the number:");
        Scanner s=new Scanner(System.in);

        num=s.nextInt();

        while(num>0)
        {
            rem=num%10;

            rev=rev*10+rem;

            num=num/10;
        }

        System.out.println("number after reversed:" +rev);
    }
    
}
