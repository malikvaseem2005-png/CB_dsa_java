package pdf_question;

public class Decimal_to_binary {

	public static void main(String[] args) {
		int n = 5;
        System.out.println(decToBinary(n));
    }

    public static int decToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        int p = decToBinary(n / 2);
        return p * 10 + (n % 2);
		// TODO Auto-generated method stub

	}

}
