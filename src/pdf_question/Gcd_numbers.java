package pdf_question;

public class Gcd_numbers {

	public static void main(String[] args) {
		int a = 12;
        int b = 18;
        System.out.println(gcd(a, b)); // GCD of two numbers
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int p = gcd(b, a % b);
        return p;
		// TODO Auto-generated method stub

	}

}
