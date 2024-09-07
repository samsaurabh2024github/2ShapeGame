package shapeProject;

public class Parallelogram implements TwoDShape{
	double a;
	double b;
	double h;
	Parallelogram(){
		
	}
	Parallelogram(Double a,double b,double h){
		this.a=a;
		this.b=b;
		this.h=h;
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Parallelogram is: "+(2*(a+b))+"sq unit");
	}
	public void getArea() {
		System.out.println("Area of Parallelogram is: "+(b*h)+"unit");
	}

}
