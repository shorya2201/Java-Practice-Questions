public class StringCompression {

    public static StringBuilder compressString(String str) {
        StringBuilder sb = new StringBuilder();// for optimizing time complexity
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;// when character appears for first time
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                // keep running the time the character repeats itself
                count++;
                i++;// while loop iterator
            }
            sb.append(str.charAt(i));// adds the character
            if (count > 1) {// if character appears more than once
                sb.append(count);// adds the no of apperances
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        String str = "aaabbccccd";
        System.out.println(compressString(str));
    }
}
