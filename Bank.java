import java.util.Scanner;
class Bank 
{
	
	public static void main (String []args)
	{
		
		Scanner Sc =new Scanner(System.in);
		
		System .out.print("choose the choice  : "  );
		System .out.print("num 1 deposit  : "  );
		System .out.print("num 2 withdarw   : "  );
		System .out.print("num 3 check bank blance : "  );
	    System .out.print("num 4 exit karo  : "  );
		double deposit=Sc.nextDouble();
		balance = balance + deposit;

           System.out.println("Amount deposited successfully");
           System.out.println("Current balance: " + balance);
		double balance=0;
      	int choice=Sc.nextInt();
		  Bank amount=new Bank();
		  amount.check(num1,num2);

			if (choice ==1)
			{
				balance = balance + deposit;
				System.out.println("Amount deposited successfully");
				System.out.println("Current balance: " + balance);
		
				
			}
			else if(choice ==2)
			{
				
				
				
				
			}
			else if (choice==3)
			{
				
				
			}
		    else if (choice==4)
			{
				
				
			}
		
	}
	
	int add(int a,int b)
	{
		
		
	return a+b;	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}