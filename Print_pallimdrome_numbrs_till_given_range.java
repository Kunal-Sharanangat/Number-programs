import java.util.*;
public class Print_pallimdrome_numbrs_till_given_range {
    public static void main(String args[])
    {
        int num,i,temp,rem,rev=0;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the range:");
        num=s.nextInt();

        for(i=1;i<=num;i++)
        {
            temp=i;

            rev=0;         //here reversed number value will be updated
            while(temp>0)
            {
                rem=temp%10;
                 rev=rev*10+rem;
                 temp=temp/10;
            }

            if(rev==i)   //  this statement will check either every number matches with reverse number or not
            {
                System.out.println(rev);
            }
  
        }
    }
    
}
