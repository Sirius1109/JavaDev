import java.util.*;

public class Switch {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Select an option £¨1,2,3,4£©");
		int choice = in.nextInt();
		switch (choice){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("bad");
		}
	}

}
