package pdf_question;

public class Print_array_reverse {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
        printReverse(arr, 0);
    }

    public static int printReverse(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int p = printReverse(arr, idx + 1);
        System.out.print(arr[idx] + " ");
        return p;
		// TODO Auto-generated method stub

	}

}
