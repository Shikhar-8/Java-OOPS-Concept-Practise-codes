class Democonover
{
	int h,w,d;
	Democonover()
	{
	h=0;
	w=0;
	d=0;
	}
	Democonover(int n)// as you can see in every contructor we have to intialize h,w,d again .
	{
	h=n;
	w=n;
	d=n;
	}
	Democonover(int a, int b, int c)
	{
	h=a;
	w=b;
		d=c;
	}
	void volume()
	{
	int vol= h*w*d;
	System.out.println("volume="+vol);
	}
}

class DemoconoverMain
{
	public static void main(String ab[])
	{
	Democonover ob = new Democonover();
	Democonover ob1 = new Democonover(5);
	Democonover ob2 = new Democonover(10,2,6);
	ob.volume();
	ob1.volume();
	ob2.volume();

	}
}