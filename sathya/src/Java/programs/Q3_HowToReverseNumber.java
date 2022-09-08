package Java.programs;

public class Q3_HowToReverseNumber {


//	int given = 123454321;
	int given=4567654;
	int reversed = 0;
	
	
	
	private void reverseNumber() {
	while(given!=0) {
	reversed=reversed*10;
	reversed=reversed+given%10;
	given=given/10;
	}
	System.out.println("Reversed Number = "+reversed);
	}
	
	
	int number = given;
	private void isPalindrome(){
				
		if(number==reversed) {
			System.out.println("Given Number is a palindrome");
		}
		else 
		{
			System.out.println("Given number is not a palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {
		Q3_HowToReverseNumber rev = new Q3_HowToReverseNumber();
		rev.reverseNumber();
		rev.isPalindrome();
	}
	
	
	
}
