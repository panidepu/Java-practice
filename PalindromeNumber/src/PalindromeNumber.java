import java.util.Scanner;
public class PalindromeNumber {
public static void main(String args[]){
 
 System.out.println("enter the number");
 int palindrome = new Scanner(System.in).nextInt();
 
 if(isPalindrome(palindrome)){
 System.out.println("Number is a palindrome");
 }else{
 System.out.println("Number is not a palindrome");
 } 
 
 }
public static boolean isPalindrome(int number) {
 int palindrome = number; 
 int reverse = 0;
while (palindrome != 0) {
 int remainder = palindrome % 10;
 reverse = reverse * 10 + remainder;
 palindrome = palindrome / 10;
 }
if (number == reverse) {
 return true;
 }
 return false;
}
}
