class Tree{
	static int h = 10;
	static int w;
	static {
		w = 20;
	}
	Tree (){
		System.out.println(h + " " + w);
	}
	
}
public class ExplicitStatticEx {
	
	public static void main(String[] args){
		new Tree();
	}

}
