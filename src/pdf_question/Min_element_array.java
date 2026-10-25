package pdf_question;

public class Min_element_array {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3};
        System.out.println(minElement(arr, 0)); // Minimum element in array
    }

    public static int minElement(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int p = minElement(arr, idx + 1);
        return Math.min(arr[idx], p);
		// TODO Auto-generated method stub

	}

}
