import java.io.*;
public class FibnocciSeries {
public static void main(String args[])throws IOException
{
	DataInputStream d= new DataInputStream(System.in);
	String s;
	int a=0,b=1,c=a=b;
	int n;
	System.out.println("enter the value of n");
	s=d.readLine();
	n=Integer.parseInt(s);
	System.out.println(a+","+b);
	while(c<=n)
	{
		System.out.println(c+",");
		a=b;
		b=c;
		c=a+b;
	}
}
}
