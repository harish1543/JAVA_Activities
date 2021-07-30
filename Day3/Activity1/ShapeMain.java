package Activity1;
import java.util.Scanner;
abstract class Shape{
	private int value;
	abstract void calculateArea(int value);
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}

class Circle extends Shape{
	void calculateArea(int value) {
		System.out.println("Area of circle:"+(3.14)*value*value);
	}
}
class Square extends Shape{
	void calculateArea(int value) {
		System.out.println("Area of Square:"+(value*value));
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Inupt \n1.Circle\n2.Square");
		int value = sc.nextInt();
		if(value==1)
		{
			new Circle().calculateArea(sc.nextInt());
		}else
		{
			new Square().calculateArea(sc.nextInt());
		}
		sc.close();
	}

}
