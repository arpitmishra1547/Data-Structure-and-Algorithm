public class leetcode1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    static String sortSentence(String s) {

        s = s.trim();
        String[] words = s.split("\\s+");
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            int len = w.length();

            int pos = w.charAt(len - 1) - '0';
            String realworld = w.substring(0, len - 1);

            result[pos - 1] = realworld;

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i != result.length - 1) {
                sb.append(" ");
            }

        }
        return sb.toString();
    }

}
