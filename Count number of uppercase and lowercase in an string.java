import java.io.*;
class UserPrint
{
	public static void main(String ab[])throws IOException
	{
	String a="";
	int lowercount=0;
	int uppercount=0;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string value");
	a=br.readLine();
	
	int l=a.length();       // loop chalane ke liye l ki value hona jarori tha.
	System.out.println("Length="+l);
	char ch = a.charAt(2);
	System.out.println("ch ="+ch );
	for(int i=0;i<l;i++)
	{
		ch=a.charAt(i);
		System.out.println(ch);
		if(ch>'A' && ch<'Z')
		{
			uppercount=uppercount+1;
		}
		else
		{
		 lowercount=lowercount+1;
		}
		
	}
	System.out.println("lowercount= "+lowercount);
		System.out.println("uppercount= "+uppercount);

	}
}