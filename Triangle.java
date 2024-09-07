package shapeProject;

public class Triangle implements TwoDShape{
	double a;
	double b;
	double c;
	
	Triangle(){
		
	}
	Triangle(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public void getArea() {
		double s=(a+b+c)/2;
		double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is: "+ar+"sq unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Triangle is: "+(a+b+c)+"unit");
	}

}
