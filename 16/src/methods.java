import java.util.Scanner;
public class methods {
	private static Scanner input;

	public static void main(String args[]){
		input = new Scanner(System.in);
		instances instancesObject = new instances();
		System.out.println("enter name of your first gf here: ");
		String temp = input.nextLine();
		instancesObject.setName(temp);
		instancesObject.saying();
		
		
		
	}
	

}


