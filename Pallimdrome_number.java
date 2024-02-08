import java.util.*;
public class Pallimdrome_number {
    public static void main(String args[])
    {
        int num,rev=0,rem,temp;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        num=s.nextInt();
        
        temp=num;

        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        if(rev==temp)
        {
            System.out.println("Number is Pallimdrome");
        }
        else{

            System.out.println("Number is not Pallimdrome");
        }

    }
    
}
