package Java.programs;

public class Q6_HowToReverseCharOfReversedWord {
	
	
	String given="Welcome To Java";
	String rev="";
	
	public void reverseLetterOfWord() {
		String revLetter="";
		String[] split = given.split(" ");
		for(int i = split.length-1; i>=0; i--) {
			 
			char[] ch = split[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				revLetter=revLetter+ch[j];
			}
			revLetter=revLetter+" ";
		}
		rev=rev+revLetter+" ";
		System.out.println(rev);
	}
	
	public static void main (String[] args) {
		Q6_HowToReverseCharOfReversedWord word = new Q6_HowToReverseCharOfReversedWord();
		word.reverseLetterOfWord();
		
	}
	
	

}
