package pdf_question;

public class Max_element_array {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3};
        System.out.println(maxElement(arr, 0)); 
    }

    public static int maxElement(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int p = maxElement(arr, idx + 1);
        return Math.max(arr[idx], p);
		// TODO Auto-generated method stub

	}

}
