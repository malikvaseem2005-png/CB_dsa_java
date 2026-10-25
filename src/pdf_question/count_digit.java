package pdf_question;

public class count_digit {

	public static void main(String[] args) {
		int n = 9876;
        System.out.println(countDigits(n)); // Count digits
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int smallAns = countDigits(n / 10);
        return smallAns + 1;
		// TODO Auto-generated method stub

	}

}
