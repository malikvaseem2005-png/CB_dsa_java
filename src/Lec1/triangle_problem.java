package Lec1;

public class triangle_problem {

	public static void main(String[] args) {
		int a=6;
		int b=5;
		int c=5;
		if(a==b && b==c ){
		    System.out.println("equilateral");
		}
		
		else if(a==b ||a==c||b==c ) {
			 System.out.println("isosceles");
		}
		
		else {
			 System.out.println("scalene");
		}
		// TODO Auto-generated method stub

	}

}
