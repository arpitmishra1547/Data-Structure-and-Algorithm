public class leetcode1768 {
    public static void main(String[] args) {
       String word1 = "abchj" ,word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));

    }
    static String mergeAlternately(String word1, String word2) {
        int limit = Math.min( word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
    }
        sb.append(word1.substring(limit));
        sb.append(word2.substring(limit));
      return sb.toString();
    }
}
