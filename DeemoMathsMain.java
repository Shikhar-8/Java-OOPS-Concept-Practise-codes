import p4.DemoMaths;
class DeemoMathsMain
{
	public static void main(String ab[])
	{
	DemoMaths ob= new DemoMaths();
	DemooMaths ob1 = new DemooMaths();
	/*
	DemoMaths ob1= new DemoMaths();
	DemoMaths ob2= new DemoMaths();  HERE WE DONT NEED TO MAKE DIFFERENT OBJECTS AS WE CALLING FUNCIONS WHIC ARE IN SAME CLASS(ie,MUl,SUB,SUM are in same class )
	DemoMaths ob3= new DemoMaths();
*/
	int y=ob.f1(5,4);
	int s=ob.mul(3,4);
	int q=ob.sub(3,2);
	int w=ob.sum(1,2);
	int t=ob1.f2(6,5);
	int y=ob1.f3(4,7);


	System.out.println("The result is "+y);
	System.out.println("The result is "+s);
	System.out.println("The result is "+q);
	System.out.println("The result is "+w);
	
	}
}