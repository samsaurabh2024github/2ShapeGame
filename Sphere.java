package shapeProject;

public class Sphere implements ThreeDShape{
	double r;
	Sphere(){
		
	}
	Sphere(double r){
	this.r=r;	
	}
	public void getVolume() {
		System.out.println("Volume of Sphere is: "+(4*3.14*r*r*r)/3);
	}
	public void getLateralSurfaceArea() {
		System.out.println("Lateral surface Area and Total Surface Area both are equal for Sphere");
	}
	
	
	public void getTotalSurfaceArea() {
		System.out.println("Surface Area of Sphere is: "+(4*3.14*r*r));
	}
	

}
