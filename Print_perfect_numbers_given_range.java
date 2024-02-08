import java.util.*;
public class Print_perfect_numbers_given_range {

    public static void main(String args[])
    {
    int num,i,count,j;          //declared variables which are needed with meaningful names

    Scanner s=new Scanner(System.in);  //created Scanner class objec
    System.out.println("enter the range");  //show messege to the user
    num=s.nextInt(); //Except integer number input


    for(i=1;i<=num;i++)
    {
         count=0;           //count's value will get updated after complition j loop 
        for(j=1;j<=i;j++)
        {
            if(i%j==0)       //every number will be checked  if it is devisible by itself and 
            {                 //other numbers 
                count++;     //count's will get increase if we found the devisors of the numbers
                

            }
        }

                                        //according to the perfect number's definition
        if(count==2)                   //If count is 2 the it will print the number 
        {
            System.out.println(i);
        }
    }
}
    
}
