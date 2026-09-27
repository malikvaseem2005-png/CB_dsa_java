package assignment_2;
import java.util.Scanner;

public class FahernhietToCeleuis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int step =sc.nextInt();
		while(min <= max) {
			int c = (min-32)*5/9;
			System.out.println(min+"\t"+c);
			min+=step;
		}

		// TODO Auto-generated method stub

	}

}
