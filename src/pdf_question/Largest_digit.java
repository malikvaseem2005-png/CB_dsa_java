package pdf_question;

public class Largest_digit {

	public static void main(String[] args) {
		int n = 492;
        System.out.println(largestDigit(n));
    }

    public static int largestDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int p = largestDigit(n / 10);
        int rem = n % 10;
        return Math.max(rem, p);
		// TODO Auto-generated method stub

	}

}
