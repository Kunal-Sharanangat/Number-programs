import java.util.*;
public class Print_odd_numbers_to_given_range {
    public static void main(String args[])
    {
        int num,i;
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the Range:");
        num=s.nextInt();

        for(i=1;i<=num;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }

    
}
