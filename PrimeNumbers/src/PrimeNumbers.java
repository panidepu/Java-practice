import java.util.*;
public class PrimeNumbers {
public static void main(String args[])
{
	int n,status=1,num=3;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	n=in.nextInt();
	if(n>=1)
	{
		System.out.println("first"+n+"prime numbers are");
		System.out.println(2);
	}
	int count;
	for(int i=0;count<=2;count<=i)
			{
				for(int j=2;j<=Math.sqrt(num);j++)
				{
					if(num%j==0)
					{
						status=0;
						break;
					}
				}
			if(status!=0)
			{
				System.out.println(num);
				count++;
			}
			status=1;
			num++;
			}
}	
}
