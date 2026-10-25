package pdf_question;

public class Print_all_indexes {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2};
        int key = 2;
        printIndexes(arr, key, 0);
    }

    public static int printIndexes(int[] arr, int key, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int p = printIndexes(arr, key, idx + 1);
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        return p;
		// TODO Auto-generated method stub

	}

}
