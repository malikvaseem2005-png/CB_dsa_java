package pdf_question;

public class Palindrome_number {

	public static void main(String[] args) {
		int n = 121;
        System.out.println(isPalindrome(n)); // Check palindrome number
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static int reverse(int n) {
        int digits = (int) Math.log10(n);
        return helper(n, digits);
    }

    public static int helper(int n, int p_pow) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        int p = helper(n / 10, p_pow - 1);
        return rem * (int) Math.pow(10, p_pow) + p;
		// TODO Auto-generated method stub

	}

}
