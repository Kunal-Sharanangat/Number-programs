import java.util.*;
public class Print_Armstrong_numbers_till_given_numbers {
    public static void main(String args[])
    {

        int num,temp,i,j,rem,sum,mul,count;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();


        for(i=1;i<=num;i++)
        {
            temp=i;
            count=0;            //count value will be updated

            while(temp>0)
            {
                temp=temp/10;
                count++;      //Her we will get the count of the current number

                if(temp==0)
                {
                    break;     //it will break the inner loop other wise it will execute till given range
                }
            }

            temp=i;   //Again here we have copied current value in temp because temp is 0 now  so  we can reuse it againg
            sum=0;
            for(j=1;j<=count;j++)
            {
                rem=temp%10;   //her will will make digit seperate one by one
                mul=1;             //Mul will update 

                for(j=1;j<=count;j++)
                {
                    mul=mul*rem;            // it will give the multiplication of every digit
                }

                sum=sum+mul;    //  Calculate the sum of mul and sum
                temp=temp/10;   // it removes the last digit
            }

            if(sum==i)          // this block will check if sum and current values is equal or not 
            {                    //if yes then will print
                System.out.println(sum);
            }
        }

   
    }
    
}
