package pdf_question;

public class Replace_character {

	public static void main(String[] args) {
		String s = "cat";
        System.out.println(replaceChar(s, 'a', 'o', 0));
    }

    public static String replaceChar(String s, char target, char replacement, int idx) {
        if (idx == s.length()) {
            return "";
        }
        char ch = s.charAt(idx);
        if (ch == target) {
            ch = replacement;
        }
        String p = replaceChar(s, target, replacement, idx + 1);
        return ch + p;
    	// TODO Auto-generated method stub

	}

}
