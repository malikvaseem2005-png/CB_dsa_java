package pdf_question;

public class Sum_even_digits {

	public static void main(String[] args) {
		int n = 1234;
        System.out.println(sumEvenDigits(n));
    }

    public static int sumEvenDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int p = sumEvenDigits(n / 10);
        int rem = n % 10;
        if (rem % 2 == 0) {
            return p + rem;
        } else {
            return p;
		// TODO Auto-generated method stub

	}

    }
    
}
