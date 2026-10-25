package pdf_question;

public class First_occurrence {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2};
        int key = 2;
        System.out.println(firstOccurrence(arr, key, 0)); // First occurrence in array
    }

    public static int firstOccurrence(int[] arr, int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        }
        int p = firstOccurrence(arr, key, idx + 1);
        return p;
		// TODO Auto-generated method stub

	}

}
