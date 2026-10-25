package pdf_question;

public class sum_of_digit {

	public static void main(String[] args) {
		int n = 123;
        System.out.println(sumOfDigits(n)); // Sum of digits
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int smallAns = sumOfDigits(n / 10);
        return smallAns + (n % 10);
	}

}
