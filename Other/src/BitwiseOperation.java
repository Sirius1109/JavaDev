

public class BitwiseOperation {
	
	public static void main(String[] args){
		int a = 0x2;
		int b = 0x15;
		System.out.printf("The two numbers are a %d and %d \n",a,b);
		
		System.out.println("a is" + Integer.toBinaryString(a));
		
		System.out.println("b is" + Integer.toBinaryString(b));
		
		System.out.println("^ is " + Integer.toBinaryString(a ^ b));
		
		System.out.println("& is" + Integer.toBinaryString(a & b));
		
		System.out.println("| is" + Integer.toBinaryString(a | b));
		
		System.out.println("~ is " + Integer.toBinaryString(~ a));
	}

}
