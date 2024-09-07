package shapeProject;

public class Cylinder implements ThreeDShape {
	double r;
	double h;
	Cylinder(){
		
	}
	Cylinder(double r,double h){
		this.r=r;
		this.h=h;
	}
	public void getVolume() {
		System.out.println("Volume of Cylinder is: "+(3.14*r*r*h));
	}
	public void getLateralSurfaceArea() {
		System.out.println("Lateral Surface Area of Cylinder is: "+2*3.14*r*h);
	}
	public void getTotalSurfaceArea() {
		System.out.println("Total Surface Area of Cylinder is: "+(2*3.14*r*(r+h)));
	}

}
