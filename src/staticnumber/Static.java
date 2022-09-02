package staticnumber;

public class Static {
	final static int NUM = 7;
	public static int NUM3 = 45;
	public static void main (String[] args) {
		System.out.println("The number is " + NUM);
		
		final int NUM2 = 3;
		int num4 = NUM + NUM2;
		System.out.println("The new number is " + num4);
		
		final int NUM5 = 76;
		int num6 = NUM3 + NUM5;			
		System.out.println("The new number is " + num6);
		
	}
	}
		
