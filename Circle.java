package shapeProject;

public class Circle implements TwoDShape {
	double r;
	Circle(){
		
	}
	Circle(double r){
		this.r=r;
	}
	public void getArea() {
		System.out.println("Area of Circle is: "+(3.14*r*r)+"sq unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is: "+(2*3.14*r)+"unit");
	}
}
