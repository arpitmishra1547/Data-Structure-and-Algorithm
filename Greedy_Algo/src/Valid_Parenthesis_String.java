// #leetcode 678
public class Valid_Parenthesis_String {
    public static void main(String[] args) {
       String s = "(*)))";
        System.out.println(solve(s,0,0));
    }

    // Recursive style
    private static boolean solve(String s,int idx,int count) {
        if(count < 0) return false;
        if(idx == s.length()){
            return count == 0;
        }

        if(s.charAt(idx) == '('){
           return solve(s,idx+1,count+1);
        }
        if(s.charAt(idx) == ')'){
            return solve(s,idx+1,count-1);
        }
        return solve(s,idx+1,count+1) || solve(s,idx+1,count-1) || solve(s,idx+1,count);

    }

//    greedy approach(optimal)

    public boolean checkValidString(String s){
        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                min++;
                max++;
            } else if(s.charAt(i) == ')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }

            if(min < 0){
                min = 0;
            }
            if(max < 0){
                return false;
            }
        }
        return min == 0;
    }
}
