class Democonpar
{
	int x,y,z;
	Democonpar(int a, int b)
{
	x=a;   // here we wont take x=5,y=6 as then it would make no sense using parameterised contructor as it would become default contructor.
	y=b;  // so here user se li gayi value will be stored.
	z=0;

}
int sum()
{ 
z=x+y;
return(z);
}
}
class DemoconparMain
{
	public static void main(String ab[])
	{
	int a,b;
	a=Integer.parseInt(ab[0]);// it is like scanf where we are taking value from user
	b=Integer.parseInt(ab[1]);
	Democonpar ob               = new Democonpar(a,b);
	// object is being called//    // now these object which are being created are send to the contructor Democonpar(a,b) whose parameter are a,b.
	int r=ob.sum();//here no input is taken as that function dont need values.  	// now this just function calling.
	}
}