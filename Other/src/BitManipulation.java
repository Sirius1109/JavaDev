
public class BitManipulation {

	public static void main(String[] args){
		
		int a = 0xfff;
		System.out.println(Integer.toBinaryString(a));
		a <<= 1;
		System.out.println(Integer.toBinaryString(a));
		
		do {
			a >>= 1;
			System.out.println(Integer.toBinaryString(a));
		}
		while (a > 0);
		
	}
}
