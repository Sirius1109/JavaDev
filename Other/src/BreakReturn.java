
public class BreakReturn {
	
	public static void main(String[] args){
		
		int a = 1;
		
		for (int i = 1; i < 200 ; i++){
			if(i == 99)
				return;
			System.out.println(i);
		}
	}

}
