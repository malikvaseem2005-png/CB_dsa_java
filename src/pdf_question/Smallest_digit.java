package pdf_question;

public class Smallest_digit {

	public static void main(String[] args) {
		int n = 492;
        System.out.println(smallestDigit(n));
    }

    public static int smallestDigit(int n) {
        if (n == 0) {
            return 9;
        }
        int p = smallestDigit(n / 10);
        int rem = n % 10;
        return Math.min(rem, p);
		// TODO Auto-generated method stub

	}

}
