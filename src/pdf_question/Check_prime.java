package pdf_question;

public class Check_prime {

	public static void main(String[] args) {
		int n = 7;
        System.out.println(isPrime(n, 2)); // Check prime
    }

    public static boolean isPrime(int n, int div) {
        if (n <= 1) {
            return false;
        }
        if (div * div > n) {
            return true;
        }
        if (n % div == 0) {
            return false;
        }
        boolean p = isPrime(n, div + 1);
        return p;
		// TODO Auto-generated method stub

	}

}
