class Democode
{
	int h,w,l;
	Democode()
	{
		h=0;
		l=0;
		w=0;
	}
	Democode(int a)
	{
		h=a;
		w=a;
		l=a;
	}
	Democode(int a,int b,int c)
	{
		h=a;
		w=b;
		l=c;
	}
	void Volume()
	{
		int vol=h*w*l;
		System.out.println("Volume is "+vol);
	}
}

class DemocodeMain
{
	public static void main(String ab[])
	{
		
		Democode ob = new Democode();
		Democode ob1 = new Democode(5);
		Democode ob2 = new Democode(10,21,1);

		ob.Volume();
		ob1.Volume();
		ob2.Volume();
		
}
}