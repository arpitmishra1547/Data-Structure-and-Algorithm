public class leetcode1221 {
    public static void main(String[] args) {
        String s = "LLLLRRRR";
        System.out.println(balancedStringSplit(s));
    }
    static int balancedStringSplit(String s) {
        int ans = 0;
        int turn1 = 0;
        int turn2 = 0;

      for (int i = 0 ; i < s.length(); i++){
          if(s.charAt(i)=='R'){
              turn1++;
          }
          else{
              turn2++;
          }
          if(turn1 == turn2){
              ans++;
          }
      }

      return ans;
    }
}
