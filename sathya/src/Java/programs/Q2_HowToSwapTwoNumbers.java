package Java.programs;

public class Q2_HowToSwapTwoNumbers {
	
	//Method1
	private void usingThirdVariable() {
		
		int a = 10;
		int b = 45;
		int c=a;
		a=b;
		b=c;
		System.out.println("AfterSwapping a and b = "+a+ " "+b+ "");	
	}
	
	private void withoutUsingThirdVariable() {
		int a = 20;
		int b = 35;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a and b = "+a+ " "+b+"");
	}
	public static void main(String[] args) {
		Q2_HowToSwapTwoNumbers num = new Q2_HowToSwapTwoNumbers();
		num.usingThirdVariable();
		num.withoutUsingThirdVariable();
	}

}
