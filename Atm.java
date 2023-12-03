import java.lang.*;
import java.io.*;
class  Atm_interface{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void withdraw(int balance,int pin_number)throws IOException
    {
        System.out.println("enter user_id and pin_number");
int user_id=Integer.parseInt(br.readLine());
       pin_number=Integer.parseInt(br.readLine());
        if(pin_number==pin_number)
        {
        try{
        if(balance!=0)
        {
        System.out.println("enter amount to be withdrawn");
 int amount=Integer.parseInt(br.readLine());
 balance=balance-amount;
System.out.println("successfully withdrawn");
System.out.println("balance amount is:" +balance);
    }
}
catch(Exception e)
{
    System.out.println(e);
}}
else{
    System.out.println("invalid user");
    System.exit(0);
}
    }
    public void deposit(int balance,int pin_number)throws IOException
    {
                System.out.println("enter user_id and pin_number");
int user_id=Integer.parseInt(br.readLine());
         pin_number=Integer.parseInt(br.readLine());
        if(pin_number==pin_number){
      try{
        System.out.println("enter amount to be deposited");
 int amount=Integer.parseInt(br.readLine());
balance=balance+amount;
System.out.println("total balance amount is:" +balance);
    }
catch(Exception e)
{
    System.out.println(e);
}
    }
    else{
        System.out.println("invalid user");
        System.exit(0);
    }}
    public void checkbalance(int balance,int pin_number)throws IOException
    {
                       System.out.println("enter user_id and pin_number");
int user_id=Integer.parseInt(br.readLine());
        pin_number=Integer.parseInt(br.readLine());
         if(pin_number==pin_number){
        System.out.println("balance is " +balance);
    }
    else
    {
        System.out.println("invalid user");
        System.exit(0);
    }}}
    class Atm{
public static void main(String args[])throws IOException
{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int balance=5000;
     int user_id;
     int pin_number;
     int account_no;
     System.out.println("enter account number");
     account_no=Integer.parseInt(br.readLine());
        System.out.println("userid");
        user_id=Integer.parseInt(br.readLine());
        System.out.println("enter pin_number");
        pin_number=Integer.parseInt(br.readLine());
        Atm_interface account=new Atm_interface();
        while(true){
         System.out.println("enter ur option");
        System.out.println("1.withdraw 2.deposit 3.check balance 4.exit");
        int op=Integer.parseInt(br.readLine());
        switch(op){
            case 1:account.withdraw( balance,pin_number);
            break;
            case 2:account.deposit(balance,pin_number);
            break;
            case 3:account.checkbalance(balance,pin_number);
            break;
            case 4:System.exit(0);
            break;
            default:System.out.println("enter correct option");
}}}}