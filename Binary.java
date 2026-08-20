class Binary 
{
	
	public static void main(String [] args)
	{
		
		
		Binary b=new Binary();
		
		int arr[]={10,23,34,45,56,57,78};
		
		int res=b.search(arr,78);
	 	
	       System.out.println(res);
	  
	
	
	
	
	
	
	}
	
    int search(int arr[],int target )
	{
		
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			
			int mid=low+high/2;
		if(arr[mid]==target)
			{
				
				return mid;
				
			}
			else if (arr[mid]<target)
			{
				
				
				low=mid+1;
			}
			
			else 
			{
				high=mid-1;
			
			}
		}
			return -1;
		
		
		
			
					
			
			
		
	}
		
		
		
		
}