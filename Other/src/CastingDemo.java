
public class CastingDemo {
	
	public static void main(String[] args){
		
		Object object1 = new Circle4(1);
		Object object2 = new Rectangle1(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object){
		if (object instanceof Circle4){
			System.out.println("The circle area is " + 
					((Circle4)object).getArea());
			System.out.println("The circle diameter is " + 
					((Circle4)object).getDiameter());
		}
		else if (object instanceof Rectangle1){
			System.out.println("The rectangle area is " + ((Rectangle1)object).getArea());
		}
	}
}

class Geometry{
	
}

class Circle4 extends Geometry{
	int radius = 0;
	Circle4(int radius){
		this.radius = radius;
	}
	
	double getArea(){
		return radius*3.1415926;
	}
	
	double getDiameter(){
		return radius*2;
	}
}


class Rectangle1 extends Geometry{
	int length = 0;
	int width = 0;
	Rectangle1(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	double getArea(){
		return length*width;
	}
}