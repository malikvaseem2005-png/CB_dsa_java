package pdf_question;

public class Remove_duplicates {

	public static void main(String[] args) {
		String s = "aabb";
        System.out.println(removeDuplicates(s, 0));
    }

    public static String removeDuplicates(String s, int idx) {
        if (idx == s.length() - 1) {
            return "" + s.charAt(idx);
        }
        String p = removeDuplicates(s, idx + 1);
        char ch = s.charAt(idx);
        if (ch == p.charAt(0)) {
            return p;
        } else {
            return ch + p;
        }
		// TODO Auto-generated method stub

	}

}
