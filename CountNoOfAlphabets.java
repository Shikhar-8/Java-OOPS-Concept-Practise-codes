import java.io.*; // Appreaciate yourself for this code as you have done it within 5 minutes.
class CountNoOfAlphabets
{
	public static void main(String ab[])throws IOException
	{
	String a="";
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter String");
	a=br.readLine();
	int l=a.length();
	int count=0;
	char ch;
	for(int i=0;i<l;i++)
	{
	ch=a.charAt(i);
	if(ch==' ')
	{ 
	continue;
	}

	else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	{
	count=count+1;
	}
	}
	System.out.println("Number of alphabets = "+count);
	}
}