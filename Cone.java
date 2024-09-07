package shapeProject;

public class Cone implements ThreeDShape {
	double r;
	double h;
	
	Cone(){
		
	}
	Cone(double r,double h){
		this.r=r;
		this.h=h;
		
	}
	public void getVolume() {
		
		System.out.println("Volume of Cone is: "+(3.14*r*r*h)/3);
	}
	public void getLateralSurfaceArea() {
		double l=Math.sqrt(h*h+r*r);
		System.out.println("Lateral Surface Area of Cone is: "+(3.14*r*l));
	}
	public void getTotalSurfaceArea() {
		double l=Math.sqrt(h*h+r*r);
		System.out.println("Total Surface Area of Cone is: "+(3.14*r*(l+r)));
	}


}
