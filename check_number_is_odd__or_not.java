import java.util.*;
public class check_number_is_odd__or_not {
    public static void main(String args[])
    {
        int num;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        num=s.nextInt();

        if(num%2!=0)
        {
            System.out.println("Giver number is Odd number");
        }
    }
    
}
