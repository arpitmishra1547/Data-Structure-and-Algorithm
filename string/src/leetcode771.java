public class leetcode771 {
    public static void main(String[] args) {
       String jewels = "aA";
       String  stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));

    }

    static int numJewelsInStones(String jewels, String stones) {
        int turn = 0;
      for (int i = 0; i < jewels.length();i++){
          for(int j = 0 ; j< stones.length(); j++){
              if(jewels.charAt(i)== stones.charAt(j)){
                  turn++;
              }
          }
      }
      return turn;
    }
}
