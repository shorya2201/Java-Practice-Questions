public class FirstLetterUpper {

    public static String convertToUppercase(String str) {
        StringBuilder sb = new StringBuilder();// to store new string with uppercase letters
        char ch = Character.toUpperCase(str.charAt(0));// Initializing with character value
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {// starting with 1 coz we have already initialized string with 0th index
                                                // value
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));// adds space to new string
                i++;// increases the pointer to point the character after space
                sb.append(Character.toUpperCase(str.charAt(i)));// and now converts the character after space to
                                                                // uppercase
            } else {
                sb.append(str.charAt(i));// else stores the character in its normal case
            }
        }
        // System.out.println(sb);
        String s3 = "";
        s3 = s3 + sb;
        return s3;
    }

    public static void letter(String s) {
        String sl[] = s.split(" ");
        StringBuilder sb1 = new StringBuilder("");
        for (String string : sl) {
            sb1.append(string.charAt(0));
            sb1.append(" ");
        }
        System.out.println(sb1);
    }

    public static void main(String[] args) {
        String str = "Hello, i am shorya rastogi";
        String s2 = convertToUppercase(str);
        letter(s2);
    }
}
