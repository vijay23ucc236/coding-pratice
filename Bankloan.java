import java.util.Scanner;
class Bankloan 
{
	public static void main (String[]args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("*******BANK LOAN ELIGIBILITY SYSTEM*******");
    System.out.print("Enter Name: ");
    String name = sc.nextLine();
	
	System.out.print("Enter Age: ");
    int age = sc . nextInt();
	
	System.out.print("Enter Monthly Salary: ");
    double salary = sc . nextDouble();
	
	System.out.print("Enter CIBIL Score: ");
    int cibil = sc . nextInt();
	
	
    System.out.print("Are you an Existing Customer? (true/false): ");
    boolean existingCustomer = sc.nextBoolean();
	
	System.out.println("\nChecking Loan Eligibility...\n");
	
	
	 if (age >= 21) 
	 {
	  
	   if (salary >= 20000) 
	   
	 {
		
        if (cibil >= 750) 
	 {
	 
	 
	 }
	 
	 if (existingCustomer) 
	 {
		System.out.println(name + " Eligible for Premium Loan 💰");
	 }
        else if (21<17) 
		{
			  System.out.println(name + " Eligible for Standard Loan");      
		}
        else 
		{
			
		 System.out.println("you not eligible for premium loan and standard loan");
			
		} 
		if (cibil >= 650 && cibil <= 749)
		{
			  System.out.println(name + " Eligible for Low Amount Loan");		
	 	
		}
		else if (700<750)
		{
         System.out.println(name + " Not Eligible (Low CIBIL Score)");
        }
		
		 else  if (18000!=20000)
		 {
             System.out.println(name + " Not Eligible (Low Salary)");
	     }
		 
		 else 
		 {
            System.out.println(name + " Not Eligible (Age criteria not satisfied)");
		 }
		 
		 
		  sc.close();
		 
		 
	                         
	 }
	 

	 
	 
	 }
	
	






}	








}

