package Lec1;

public class salery_bonus {

	public static void main(String[] args) {
		int salery=15000;
		int experience=3;
		if(experience>=5) {
			int bonus= salery*10/100;
			int totalsalery = salery+bonus;
			System.out.println(totalsalery);
			}
		else {
			System.out.println("no bonus Salery is same " +salery);
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
