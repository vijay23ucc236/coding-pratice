class Constructor1
{
	String carname;
	int model;
	String carnumber;
	String color;
	public static void main(String [] args)
	{
		Constructor1 c=  new Constructor("Benz",2001,"TN64W06071","white");
		Constructor1 c1= new Constructor("audi",2005,"TN64W06071","red");		
		Constructor1 c2= new Constructor("honda",2004,"TN64W06071","black");		
		Constructor1 c3= new Constructor("firari",2002,"TN64W06071","white");		
		Constructor1 c4= new Constructor("roll roice",2009,"TN64W06071","yellow");		
		
		c.display();
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		
		
	}
	Constructor1(String carname,int model,String carnumber,String color)
	{
		this.carname="name";
		this.model=model;
		this.carnumber="carnumber";
		this.color="color";
		
		
	}
	
	void display()
	{
		System.out.println(carname);
		System.out.println(model);
		
		System.out.println(carnumber);
		System.out.println(color);
		
		
		
	}
	
	
	
	
}