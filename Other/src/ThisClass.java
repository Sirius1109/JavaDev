
public class ThisClass {
	ThisClass(){
		this("ss");
	}
	
	ThisClass(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args){
		new ThisClass();
	}
}


