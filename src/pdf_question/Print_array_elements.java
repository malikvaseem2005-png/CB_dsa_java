package pdf_question;

public class Print_array_elements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
        printArray(arr, 0); // Print array elements
    }

    public static int printArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        System.out.print(arr[idx] + " ");
        int p = printArray(arr, idx + 1);
        return p;
		// TODO Auto-generated method stub

	}

}
