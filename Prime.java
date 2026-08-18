 class Prime 
{
    public static void main (String []args )
	{
		
		(int n) 
	{

        if (n <= 1) 
		{
            return false;
        }

        for (int i = 2; i <= n / 2; i++)
			{
            if (n % i == 0)
				
			{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) 
	{

        int n = 7;

        if (Prime(n)) 
		{
            System.out.println(n + " is a Prime");
        } else 
		{
            System.out.println(n + " is Not Prime");
        }
    }
 
}