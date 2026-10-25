package pdf_question;

public class Count_even_numbers {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4};
        System.out.println(countEven1(arr, 0)); // Count even numbers
    }

    public static int countEven1(int[] arr, int i) {
        if (arr.length == i) {
            return 0;
        }
        
        int val = arr[i];
        int c = 0;
        if (val % 2 == 0) {
            c = 1;
        }
        
        // Recursive call ka result 'p' variable mein store kiya
        int p = countEven1(arr, i + 1);
        
        return c + p;
		// TODO Auto-generated method stub

	}

}
