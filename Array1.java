class Array
{
	public static void main(String [] args)
	{
		
	int arr[]={10,20,30};
     Array a=new Array();
	System.out.println("before");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	a.change(arr);
		
	System.out.println("after");	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
			
		
		
		
		
		
		
	}
	void change(int arr[])
	{
	
	
	arr[0]=100;
	arr[1]=150;
	arr[2]=200;
	
	
	
	}
	
	
	
	
	
	
	
	
}