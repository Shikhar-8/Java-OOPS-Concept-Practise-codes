import java.io.*;
class Checker
{
	public static void main(String ab[])throws IOException
	{
	String a="";
	String c="";
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Email ID");
	a=br.readLine();
	int l=a.length(); 
	int count=0,j=0,A=0,B=0,C=0,D=0;
    char ch;
	
	for(int i=0;i<l;i++)
	{
		ch=a.charAt(i);
		if(ch>='A' && ch<='Z')	
	     {
	     	A=1;
	
	     }
	else if(ch>='a' && ch<='z')
	     {
	     	B=1;
	
	     }
	else if(ch>='0' && ch<='9')
	     {
	     	C=1;
	
	     }
	else
	    {
	     D=1;
	    }

	}

	if(A==1)
	{
	System.out.println("There are uppercase in given string ");	
	}
	if(B==1) // if i had used else if in each case then only A==1 case would be considered, as vahi par hi ruk jayega and aage nahi badega ie B==1 , c==1 vaale loop par pahuche hi nnahi.
	{
		System.out.println("There are lowercase in given string ");
	}
	if(C==1)
	{
System.out.println("There are digits in given string ");
	}
	if(D==1)
	{
System.out.println("There are special characters in given string ");
	}

}
}