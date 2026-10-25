package pdf_question;

public class Remove_zeros {

	public static void main(String[] args) {
		int n = 1020;
        System.out.println(removeZeros(n));
    }

    public static int removeZeros(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        int p = removeZeros(n / 10);
        if (rem == 0) {
            return p;
        } else {
            return p * 10 + rem;
		// TODO Auto-generated method stub

	}

}
}
