class Recursion
{
	public static void main(String []args)
 {
	int arr[]={10,20,30,40,50};
	int target=30;
	Recursion r=new Recursion();
	
		int res=r.search(arr,target,0);
		System.out.println(res);
		
 }
	int search(int arr[],int target,int index)
	{
		if (index==arr.length)
		{
			return -1;
		}
		
	    if (arr[index]==target) 
		{
	     return index;
		}
		return search(arr,target,index+1);
  	}
	
	
}