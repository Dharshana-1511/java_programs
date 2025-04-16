package java_giithub;

public class PalindormeCheck {

	public static void main(String[] args) 
{
		String input= "Automation";
		String  reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);
 
 	if(reversed.equals(input))
		 
 {
	 System.out.println("It is an example of palindrome");
	 
 }
 
 	else
 {
	 System.out.println("It is NOT a palindrome");

 }
 
}
	}
