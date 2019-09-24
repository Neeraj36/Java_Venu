
import java.io.*;
import java.util.Scanner;



public class Atmprocess {
    int bal;
    void input()
    {  
       Scanner sc=new Scanner(System.in);
        System.out.println("***********WELCOME TO KK BANK OF INDIA (Pvt Ltd.)**************");
        System.out.println("\nPlease enter your 9-digit account number");
        String id=sc.nextLine().trim();
        System.out.println("Please enter your password");
        String pw=sc.nextLine().trim();
        System.out.println("\n**********ACCOUNT DETAILS***********");
        if(id.equals("003457001")&&pw.equals("1290"))
        {
            String name="Rakesh Patil";
            String acctype="Savings Account";
            bal=115000;
            System.out.println("\nName: " + name + "\nAccount Type: " + acctype + "\nBalance: " + bal);
        }
        else if(id.equals("546078900")&&pw.equals("2349"))
        {
            String name="Parth Singh";
            String acctype="Current Account";
            bal=56000;
            System.out.println("\nName: " + name + "\nAccount Type: " + acctype + "\nBalance: " + bal);

            try
            {
              
            FileWriter fw=new FileWriter("C:/Users/AVENUNEE/atmDetails.txt");          
                      
            fw.write("name :"+name);            
            fw.write("Account type :"+acctype);
            fw.write("Balance :"+bal);
            fw.close();
            
            }
            catch(Exception e)
            {
              System.out.println("exception occured");
            }
            
        }
        else if(id.equals("456708632")&&pw.equals("3578"))
        {
            String name="Siddharth Sharma";
            String acctype="Current Account";
            bal=87000;
            System.out.println("\nName: " + name + "\nAccount Type: " + acctype + "\nBalance: " + bal);
            try
            {
              
            FileWriter fw=new FileWriter("C:/Users/AVENUNEE/atmDetails.txt");          
                      
            fw.write("name :"+name);            
            fw.write("Account type :"+acctype);
            fw.write("Balance :"+bal);
            fw.close();
            
            }
            catch(Exception e)
            {
              System.out.println("exception occured");
            }
            
        }
        else if(id.equals("653257890")&&pw.equals("6836"))
        {
            String name="Krishna Asrani";
            String acctype="Savings Account";
            bal=150000;
            System.out.println("\nName: " + name + "\nAccount Type: " + acctype + "\nBalance: " + bal);
            try
            {
              
            FileWriter fw=new FileWriter("C:/Users/AVENUNEE/atmDetails.txt");          
                      
            fw.write("name :"+name);            
            fw.write("Account type :"+acctype);
            fw.write("Balance :"+bal);
            fw.close();
            
            }
            catch(Exception e)
            {
              System.out.println("exception occured");
            }
            
        }
        else if(id.equals("753879074")&&pw.equals("3897"))
        {
            String name="Vikas Vyas";
            String acctype="Savings Account";
            bal=97000;
            System.out.println("\nName: " + name + "\nAccount Type: " + acctype + "\nBalance: " + bal);
            try
            {
              
            FileWriter fw=new FileWriter("C:/Users/AVENUNEE/atmDetails.txt");          
                      
            fw.write("name :"+name);            
            fw.write("Account type :"+acctype);
            fw.write("Balance :"+bal);
            fw.close();
            
            }
            catch(Exception e)
            {
              System.out.println("exception occured");
            }
            
        }
        else
        {
            System.out.println("Invalid Account or Password!");
            System.exit(0);
        }
        System.out.println("\n1.Deposit\n2.Withdraw\n3.Exit\nEnter the serial number of the action you want to perform");
        int ch=sc.nextInt();
   
        switch(ch)
        {
            case 1:
            System.out.println("\nEnter the amount to deposit ");
            int bal1=sc.nextInt();
            bal=bal+bal1;
            System.out.println("\nNew Balance: "+bal);
            break;
            case 2:System.out.println("\nEnter the amount to withdraw ");
            int bal2=sc.nextInt();
            bal=bal-bal2;
            if(bal<=0)
                System.out.println("Not Enough Money!");
            else
                System.out.println("\nNew Balance: "+bal);
            break;
            case 3: System.exit(0);
            break;
            default: System.out.println("Invalid choice!");
           
        }
    }
    public static void main(String[] args)
    {
       Atmprocess ob = new Atmprocess();
        ob.input();
        System.out.println("\nPlease Give A Like!!\nSpecial Thanks To @LukArToDo Who Helped Me A Lot With This Code!");
    }


}

