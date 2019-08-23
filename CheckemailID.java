import java.io.*;
class CheckemailID
{
	public static void main(String ab[])throws IOException
	{
	String a="";
	String c="";
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Email ID");
	a=br.readLine();
	int l=a.length(); 
	int count=0,j=0;
    char ch;
    int F1=0;
    int F2=0;
    int F3=0;
    int F4=0;
	
	for(int i=0;i<l;i++)
	{
		ch=a.charAt(i);
		if(ch==' ')
		{
			F1=1;
		}
		else if(ch=='@')
		{
			F2=1;
		}
		
		else if(ch=='.') // or (charAt(i)=='.')
		{
			F3=1;
			System.out.println("i="+i); /* In this part i am checking that after dot there should be only 2 or 3 characters like .com or .in*/
			for(j=(i+1);j<l;j++)// here i+1  is done because in counting value of count . ki value bhi add ho rahi thi
			{
			 count=count+1;
			}
			System.out.println("Value of count is "+count);
		}
		else if((a.charAt(0)>='A' && a.charAt(0)<='Z') || (a.charAt(1)>='a' && a.charAt(1)<='z'))// used (0) so that first letter is alphabet only.
		{
			F4=1;
		}
		/* else if(ch=='.')    here i will not get output as this looop tak pahuchenga hi nahi.
		{
			System.out.println("i="+i);   // i can write ch == a.charAt(i) both are same.
		} */
		


	}
	if(F1==0 && F2==1 && F3==1 && F4==1 && (count>=2 && count<=3))
	{
		System.out.println("Valid Email ID");
	}
	else
	{
		System.out.println("invalid Email ID");
	}

}
}