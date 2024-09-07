package shapeProject;

public class Rhombus implements TwoDShape{
	double d1;
	double d2;
	double a;
	Rhombus(){
		
	}
	Rhombus(double d1, double d2,double a){
		this.d1=d1;
		this.d2=d2;
		this.a=a;
	}
	public void getArea() {
		System.out.println("Area of Rhombus is: "+(d1+d2)/2+"sq unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Rhombus is: "+(4*a)+"unit");
	}
}
