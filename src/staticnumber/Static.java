package staticnumber;

public class Static {
	final static int NUM = 7;
	public static int NUM3 = 45;
	public static void main (String[] args) {
		System.out.println("The number is " + NUM);
		
		final int NUM = 3;
		System.out.println("The new number is " + NUM);
		
			{final int NUM3 = 76;		
			System.out.println("The new number is " + NUM3);
		}
	}
	}
		
