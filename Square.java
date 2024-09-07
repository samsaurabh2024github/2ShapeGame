package shapeProject;

public class Square implements TwoDShape {
	double a;
	Square(){
		
	}
	Square(double a){
		this.a=a;
		
	}
	public void getArea() {
		System.out.println("Area of Square is: "+(a*a)+"sq unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Square is: "+(4*a)+"unit");
	}

}
