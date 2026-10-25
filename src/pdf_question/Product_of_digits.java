package pdf_question;

public class Product_of_digits {

	public static void main(String[] args) {
		int n = 234;
        System.out.println(productOfDigits(n)); // Product of digits
    }

    public static int productOfDigits(int n) {
        if (n == 0) {
            return 1; // Base case returns 1 for multiplication identity
        }
        int smallAns = productOfDigits(n / 10);
        return smallAns * (n % 10);
		// TODO Auto-generated method stub

	}

}
