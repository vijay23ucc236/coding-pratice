import java.util.Scanner; 
class Bank
{
	
	double a= 1000;
	
	void deposit(double amount)
	{
		
		a= a + amount;
		
		
	}
	
	
	void withdraw(double amount)
	{
		
		a= a - amount;
	}
	
	
	void displaybalance()
	{
		
			
		System.out.println( a);
	}
	
	
	
	public static void main (String []args)
	{
		
		
		Scanner Sc=new Scanner(System.in);
		System.out.print("choose : ");    
		
		int choice=Sc.nextInt();
	    Bank b=new Bank();
       
		while (choice!=4)
		{
             choice = Sc.nextInt();
	
	
           if (choice==1)
           {
	    double amount = Sc.nextDouble();
        b.deposit(amount);
         System.out.println("Amount deposited Balance = " + b.a); 
	       
            
           }
	
	      else if (choice==2)
	       {
		    double amount=Sc.nextDouble();
		   b.withdraw(amount);
		   System.out.println("Amount withdraw Balance = " + b.a); 
		
	   	  
	       }
	
	      else if (choice==3)
	         {
		     b.displaybalance();
             
	         }
        else if  (choice ==4)
	       {
	    System.out.println( "exit" );
		
		     
	       }

	       else 
	        {
	      System.out.println( "invalid balance" );
	        }
        }			
    }

	
	
	
	
	
	
	
	
	
}