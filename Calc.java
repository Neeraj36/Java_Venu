
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   int a,b,c,selection;
		   System.out.print("Enter any two digits:");
		   a=scan.nextInt(); 
		   b=scan.nextInt(); 
		   
		   System.out.print("Make your selection");
		   System.out.print("1.addition");
		   System.out.print("2.subtraction");
		   System.out.print("3.division");
		   System.out.print("4.multiplication");
		   
		   
		   selection=scan.nextInt(); 
		   
		   while (selection>4) {
			   System.out.print("please enter correct digit:");  
			   selection=scan.nextInt();
		   }
		   
		   Calc1 mani =new Calc1();
		   if(selection==1) {
		       c=mani.add(a,b);  
		       System.out.print("your answer is:" +c);
		   }else if (selection==2){
			   c=mani.sub(a,b);
			   System.out.print("your answer is:" +c);
		   }else if (selection==4){
			   c=mani.multi(a,b);
			   System.out.print("your answer is:" +c);
		   }else if (selection==3){
			   c=mani.dev(a,b);
			   System.out.print("your answer is:" +c);
		   }
	   }
		   
  }

