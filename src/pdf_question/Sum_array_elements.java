package pdf_question;

public class Sum_array_elements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
        System.out.println(sumArray(arr, 0)); // Sum of array elements
    }

    public static int sumArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int p = sumArray(arr, idx + 1);
        return arr[idx] + p;
		// TODO Auto-generated method stub

	}

}
