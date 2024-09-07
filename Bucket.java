package shapeProject;

public class Bucket implements ThreeDShape {
	double r;
	double R;
	double h;
	double r2=R-r;
	double l=Math.sqrt(h*h+((R-r)*(R-r)));
	Bucket(){
		
	}
	Bucket(double r,double R,double h){
		this.r=r;
		this.R=R;
		this.h=h;
	}
	public void getVolume() {
		System.out.println("Volume of Bucket is: "+(1/3*3.14*h*(R*R+r*r+R*r)));
	}
	public void getLateralSurfaceArea() {
		System.out.println("Lateral Surface Area of Bucket is: "+(3.14*(R+r)*l));
	}
	public void getTotalSurfaceArea() {
		System.out.println("Total Surface Area of Bucket is: "+(3.14*(R+r)*l+r*r+R*R));
	}


}
