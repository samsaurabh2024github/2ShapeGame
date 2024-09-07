package shapeProject;

public class HemiSphere implements ThreeDShape {
	double r;
	HemiSphere(){
		
	}
	HemiSphere(double r){
		this.r=r;
	}
	public void getVolume() {
		System.out.println("Volume of HemiSphere is: "+(2*3.14*r*r*r)/3);
	}
	public void getLateralSurfaceArea() {
		System.out.println("Lateral Surface Area of HemiSpehre is: "+(2*3.14*r*r));
	}
	public void getTotalSurfaceArea() {
		System.out.println("Total Surface Area of HemiSphere is: "+(3*3.14*r*r));
	}


}
