package pdf_question;

public class Reverse_number {

	public static void main(String[] args) {
		int n = 123;
        System.out.println(reverse(n)); // Reverse a number
    }

    public static int reverse(int n) {
        int digits = (int) Math.log10(n);
        return helper(n, digits);
    }

    public static int helper(int n, int p) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        int smallAns = helper(n / 10, p - 1);
        return rem * (int) Math.pow(10, p) + smallAns;
		// TODO Auto-generated method stub

	}

}
