import java.util.Scanner;
class Countnumbers
{
	 public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) 
		{
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

        sc.close();
		
		
    }





	
		
		
		
		
	
	
	
	
	
	
	
	
} 
	
	
   
	






