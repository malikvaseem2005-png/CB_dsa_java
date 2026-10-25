package pdf_question;

public class Count_zeros {

	public static void main(String[] args) {
		int n = 10020;
        System.out.println(countZeros(n));
    }

    public static int countZeros(int n) {
        if (n == 0) {
            return 0;
        }
        int p = countZeros(n / 10);
        int rem = n % 10;
        if (rem == 0) {
            return p + 1;
        } else {
            return p;
		// TODO Auto-generated method stub

	}

}
}
