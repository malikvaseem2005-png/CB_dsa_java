package pdf_question;

public class Length_of_string {

	public static void main(String[] args) {
		String s = "hello";
        System.out.println(lengthOfString(s, 0));
    }

    public static int lengthOfString(String s, int idx) {
        if (idx == s.length()) {
            return 0;
        }
        int p = lengthOfString(s, idx + 1);
        return 1 + p;
		// TODO Auto-generated method stub

	}

}
