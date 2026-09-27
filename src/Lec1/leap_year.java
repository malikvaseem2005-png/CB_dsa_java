package Lec1;

public class leap_year {

	public static void main(String[] args) {
		int year=2022;
		if(year%4==0 && year%100!=0) {
			System.out.println("leap year");
		}
		else if(year%400==0) {
			System.out.println("leap year");
			
		}
		else {
			System.out.println("not leap year");
		}
		// TODO Auto-generated method stub

	}

}
