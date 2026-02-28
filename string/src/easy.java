import java.sql.SQLOutput;
import java.util.Arrays;

public class easy {
    public static void main(String[] args) {
        String a = "  Book lelo na";
         number(a);
    }

     static void number(String a){
     a = a.trim();
     String[] words = a.split("\\s+");
     System.out.println(Arrays.toString(words));
     String b = words[words.length-1];
     System.out.println(b.length());


    }
}



// NOTE:
// If you print an array directly like:
//     System.out.println(words);
// The output will look like:
//     [Ljava.lang.String;@27716f4
//
// Meaning:
// [              → This is an array
// L              → The array contains objects (not primitives)
// java.lang.String → Type stored in the array
// @27716f4       → Hashcode (memory reference) of the array object
//
// This does NOT print the actual contents of the array.
// To print values, use:
//     System.out.println(Arrays.toString(words));

