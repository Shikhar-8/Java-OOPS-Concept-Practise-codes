class DemoCon
{
	int a,b,c;
	DemoCon()// without this it was giving value of a,b,c = zero . here point to be note was that it was not storing garbage value , it is storing zero value.
	          // but with this constructor it is giving some value. 
	{
	a=15;
	b=12;
	c=13;
	}

void display()
{
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
}

}
class DemoConMain
{
	public static void main(String ab[])
	{
	DemoCon ob = new DemoCon();
	ob.display();
	}
}