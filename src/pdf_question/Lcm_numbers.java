package pdf_question;

public class Lcm_numbers {

	public static void main(String[] args) {
		int a = 4;
        int b = 6;
        System.out.println(lcm(a, b));
    }

    public static int lcm(int a, int b) {
        int gcdVal = gcd(a, b);
        int p = (a * b) / gcdVal;
        return p;
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
