class Constpar

{ 
    int x,y,z;
	Constpar(int a, int b, int c)
{
	x=a;
	y=b;
	z=c;
}
 String grea()
{
	String msg="";// here i have used string to store character
	if(x>y && x>z)
	{
		msg="A is greater="+x;	
	}

   else if(y>x && y>z)
   {
   	msg="B is greater="+y;
   
    }
    else 
    {
    	msg="c is greater="+z;
    
    }
   
return(msg);
}

}

class ConstparMain
{
	public static void main(String ab[])
	{
int a,b,c;
String s1;
a=Integer.parseInt(ab[0]);
b=Integer.parseInt(ab[1]);
c=Integer.parseInt(ab[2]);
Constpar ob = new Constpar(a,b,c);
s1= ob.grea();// here no
system.out.println(s1);
 
}