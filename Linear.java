class Linear
{
	public static void main(String [] args)
	{
		
    Linear l=new Linear();
	
	int arr[]={34,344,52,53,34};
	int target=53;
	
	
	int res = l.search(arr,target);
		System.out.println(res);
		
		
		
		
		
	}
	
	
	int search(int arr[], int target)
	{
		
		for (int i=0;i<arr.length;i++)
		{
			if (target==arr[i])
			{
				
				return i;
			}
			
		}
		return -1;	
		
	}
	
	
	
	
	
	
}