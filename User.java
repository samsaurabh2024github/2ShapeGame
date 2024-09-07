package shapeProject;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
	    Game g=new Game();
		int choice=g.selectShape();
		do {
		switch(choice) {
			case 1:
				TwoDShape t1=g.selectTwoDShape();
				t1.getArea();
				t1.getPerimeter();
				break;
				
			case 2:
				ThreeDShape t2=g.selectThreeDShape();
				t2.getLateralSurfaceArea();
				t2.getTotalSurfaceArea();
				t2.getVolume();
			
		}
		
		System.out.println("Press Y/y to continue or other character to exit");
		ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		System.out.println("Thank You for Playing the Game!!");
		System.out.println("See You Again!!");
	}
}
