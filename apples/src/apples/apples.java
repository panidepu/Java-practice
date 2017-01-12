package apples;
import java.util.Scanner;

public class apples {
	private static Scanner a;

	public static void main(String args[]){

	a = new Scanner(System.in);
	double num1,num2;
	char sum,sub,div,mul;
	
	System.out.println("enter the first number");
	num1 = a.nextDouble();
	
	System.out.println("enter the second number");
	num2 = a.nextDouble();
	System.out.println("enter the operator");
	
	if(op == sum)
	System.out.println(sum = num1 + num2);
	else
		if(op == mul)
	System.out.println(mul = num1 * num2);
		else
			if(op == div)
	System.out.println(div = num1 / num2);
			else
				if(op == sub)
	System.out.println(sub = num1 - num2);
}
}
	
