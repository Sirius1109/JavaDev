
public class Fibonacci {
	
	static void getFibonacci(int i){
		int a = 1, b = 1;
		int d = 0;
		if ( i == 1)
			System.out.println(1);
		else if (i >= 2){
			System.out.print(1 +" " + 1 +" ");
			for (int c = 3; c <= i; c++){
				d = b;
				b += a;
				a = d;
				
			
			System.out.print( b + " ");
			}
		}
			
	}
		
	
	public static void main(String[] args){
		
		getFibonacci(10);
		

	}

}
