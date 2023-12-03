import java.io.*;
import java.lang.*;
import java.util.Random;
class Random_number_game{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Random r=new Random();
        int randomnumber=r.nextInt(100);
        int count=0;
         System.out.println("enter number of attempts");
        int n=Integer.parseInt(br.readLine());
        while(count<n)
        {
            System.out.println("enter ur guess from 0 to 100");
        int guess=Integer.parseInt(br.readLine());
   if(guess==randomnumber)
{
    System.out.println("oops! you win");
break;
}
else if(guess>randomnumber)
{
    System.out.println("your guess is high,try again!");
    count++;
}
else{
    System.out.println("your guess is low,try again!");
    count++;
}
        }
        if(count==n)
        {
            System.out.println("your tries are completed");
        }
    }
}

