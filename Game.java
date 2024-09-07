package shapeProject;

import java.util.Scanner;

public class Game {
	Game(){
		System.out.println("Welcome to Game");
		System.out.println("Game is now started!!!");
	}
	
	public int  selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====Press 1 for 2-D Shape=====");
		System.out.println("=====Press 2 for 3-D Shape=====");
		int x=sc.nextInt();
		if(x==1) {
			System.out.println("You have Slected 2-D shape");
			return x;
		}
		else if(x==2){
			System.out.println("You have Slected 3-D shape");
			return x;
		}
		else {
			System.out.println("This is not a Valid Choice!!");
			System.out.println("Please Select From Right Options");
			return selectShape();
		}
			
	}
	
	public TwoDShape selectTwoDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====Press 1 for Circle=====");
		System.out.println("=====Press 2 for Rectangle=====");
		System.out.println("=====Press 3 for Triangle=====");
		System.out.println("=====Press 4 for Square=====");
		System.out.println("=====Press 5 for Parallelogram=====");
		System.out.println("=====Press 6 for Rhombus=====");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("you Have Selected Circle");
				System.out.println("Enter The Radious");
				double r=sc.nextDouble();
				Circle c1=new Circle(r);
				return new Circle(r);
			case 2:
				System.out.println("you Have Selected Rectangle");
				System.out.println("Enter The Length");
				double l=sc.nextDouble();
				System.out.println("Enter The Base");
				double b=sc.nextDouble();
				Rectangle t1=new Rectangle(l,b);
				return new Rectangle(l,b);
				
			case 3:
				
				System.out.println("you Have Selected Triangle");
				System.out.println("Enter Side a: ");
				double sidea=sc.nextDouble();
				System.out.println("Enter Side b or base: ");
				double sideb=sc.nextDouble();
				System.out.println("Enter Side c: ");
				double sidec=sc.nextDouble();
				return Triangle(sidea,sideb,sidec);
				
			case 4:
				System.out.println("you Have Selected Square");
				System.out.println("Enter Side: ");
				double a=sc.nextDouble();
				return new Square(a);
				
			case 5:
				System.out.println("you Have Selected Parallelogram");
				System.out.println("Enter Parallel Side a: ");
				double p1=sc.nextDouble();
				System.out.println("Enter Parallel Side b: ");
				double p2=sc.nextDouble();
				System.out.println("Enter height h: ");
				double h=sc.nextDouble();
				return new Parallelogram(p1,p2,h);
				
			case 6:
				System.out.println("you Have Selected Rhombus");
				System.out.println("Enter side:  ");
				double side=sc.nextDouble();	
				System.out.println("Enter Diadonal d1: ");
				double d1=sc.nextDouble();
				System.out.println("Enter Diadonal d2: ");
				double d2=sc.nextDouble();	
				return new Rhombus(d1,d2,side);
				
			default:
				System.out.println("This is not the Valid Choice!");
				System.out.println("Please Select from Right Options");
				return selectTwoDShape();
		}
	
	}
	
	
//		public static Triangle getTriangle(int a, int b, int c)
//		{
//		
//		if(a+b>c && b+c>a && c+a>b) {
//			System.out.println("It is a Valid Triangle");
//			return new Triangle(a,b,c);
//		}
//			else {
//				System.out.println("it is not a valid Triangle");
//				return getTriangle;
//				
//		}
//	}
//	
	
	private TwoDShape Triangle(double sidea, double sideb, double sidec) {
		// TODO Auto-generated method stub
		return null;
	}

	public ThreeDShape selectThreeDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====Press 1 for CYlinder=====");
		System.out.println("=====Press 2 for Sphere=====");
		System.out.println("=====Press 3 for HemiSphere=====");
		System.out.println("=====Press 4 for Cone=====");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("you Have Selected Cylinder");
				System.out.println("Enter The Radious of Cylinder: ");
				double r=sc.nextDouble();
				System.out.println("Enter height of Cylinder");
				double h=sc.nextDouble();
				return new Cylinder(r,h);
			case 2:
				System.out.println("you Have Selected Sphere");
				System.out.println("Enter Radious: ");
				double sphere_r=sc.nextDouble();
				return new Sphere(sphere_r);
			case 3:
				System.out.println("you Have Selected HemiSphere");
				System.out.println("Enter Radious: ");
				double hemi_r=sc.nextDouble();
				return new HemiSphere(hemi_r);
			case 4:
				System.out.println("you Have Selected Cone");
				System.out.println("Enter The Radious: ");
				double radious=sc.nextDouble();
				System.out.println("Enter The Height: ");
				double height=sc.nextDouble();
				return new Cone(radious,height);
			
			default:
				System.out.println("This is not the Valid Choice!");
				System.out.println("Please Select from Right Options");
				return selectThreeDShape();
		}
	
	}
}
