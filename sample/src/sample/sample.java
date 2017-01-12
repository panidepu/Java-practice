package sample;
import java.util.Scanner;
class apples{
	
	private static Scanner a;

	public static void main(String args[]){
		a = new Scanner(System.in);
		double num1,num2,answer;
		System.out.println("enter first number");
		num1=a.nextDouble();
		System.out.println("enter second number");
		num2=a.nextDouble();
		answer=num1+num2;
		System.out.println(answer);
		
	}
	
}