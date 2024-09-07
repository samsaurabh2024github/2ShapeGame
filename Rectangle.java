package shapeProject;

public class Rectangle implements TwoDShape {
	double l;
	double b;
	Rectangle(){
		
	}
	Rectangle(double l, double b){
		this.l=l;
		this.b=b;
	}
	public void getArea() {
		System.out.println("Area of Rectangle is: "+(l*b+"sq unit"));
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle is: "+2*(l+b)+"unit");
	}
}
