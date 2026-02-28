public class stringbuilder {
    public static void main(String[] args) {

        // 1. Different ways to create StringBuilder
        StringBuilder sb1 = new StringBuilder();              // empty
        StringBuilder sb2 = new StringBuilder("Arpit");       // with initial content
        StringBuilder sb3 = new StringBuilder(50);            // with capacity (no content yet)

        System.out.println("sb1: \"" + sb1 + "\"");
        System.out.println("sb2: \"" + sb2 + "\"");
        System.out.println("sb3 (capacity 50): length = " + sb3.length() + ", capacity = " + sb3.capacity());
        System.out.println("--------------------------------------------------");

        // 2. append() – adding different types at the end
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");      // append String
        sb.append(123);           // append int
        sb.append('!');           // append char
        sb.append(true);          // append boolean

        System.out.println("After append: " + sb);  // Hello World123!true
        System.out.println("length() = " + sb.length());
        System.out.println("capacity() = " + sb.capacity());
        System.out.println("--------------------------------------------------");

        // 3. insert() – insert at specific positions
        sb.insert(5, ",");        // insert comma after "Hello"
        System.out.println("After insert comma at index 5: " + sb);

        sb.insert(0, "Start: ");  // insert at beginning
        System.out.println("After insert at beginning: " + sb);
        System.out.println("--------------------------------------------------");

        // 4. charAt() – get character at an index
        char ch = sb.charAt(0);
        System.out.println("charAt(0): " + ch);
        System.out.println("--------------------------------------------------");

        // 5. setCharAt() – modify a character
        sb.setCharAt(0, 's');     // change 'S' to 's' if it was 'S'
        System.out.println("After setCharAt(0, 's'): " + sb);
        System.out.println("--------------------------------------------------");

        // 6. delete() – delete a range of characters [start, end)
        // Let's delete "Start: " from beginning (it is 7 characters)
        sb.delete(0, 7);
        System.out.println("After delete(0, 7): " + sb);
        System.out.println("--------------------------------------------------");

        // 7. deleteCharAt() – delete single character
        // Delete the comma after "Hello"
        int indexOfComma = sb.indexOf(",");
        if (indexOfComma != -1) {
            sb.deleteCharAt(indexOfComma);
        }
        System.out.println("After deleteCharAt(comma): " + sb);
        System.out.println("--------------------------------------------------");

        // 8. replace() – replace part of the content
        // Replace "World" with "Java"
        int startWorld = sb.indexOf("World");
        if (startWorld != -1) {
            int endWorld = startWorld + "World".length();
            sb.replace(startWorld, endWorld, "Java");
        }
        System.out.println("After replace \"World\" with \"Java\": " + sb);
        System.out.println("--------------------------------------------------");

        // 9. substring() – extract part as normal String
        String sub1 = sb.substring(0, 5); // first 5 chars
        String sub2 = sb.substring(6);    // from index 6 to end

        System.out.println("substring(0, 5): " + sub1);
        System.out.println("substring(6): " + sub2);
        System.out.println("--------------------------------------------------");

        // 10. reverse() – reverse the whole StringBuilder content
        sb.reverse();
        System.out.println("After reverse(): " + sb);
        System.out.println("--------------------------------------------------");

        // 11. ensureCapacity() – make sure capacity is at least this much
        sb.ensureCapacity(100);
        System.out.println("After ensureCapacity(100): capacity() = " + sb.capacity());
        System.out.println("--------------------------------------------------");

        // 12. setLength() – change length (truncate or pad with '\u0000')
        sb.setLength(5);   // keep only first 5 characters
        System.out.println("After setLength(5): \"" + sb + "\" length = " + sb.length());
        System.out.println("--------------------------------------------------");

        // 13. Clear the StringBuilder (common trick)
        sb.setLength(0);   // clear content
        System.out.println("After clear using setLength(0): \"" + sb + "\" length = " + sb.length());
        System.out.println("--------------------------------------------------");

        // 14. toString() – convert final result to String
        sb.append("Final Text");
        String result = sb.toString();  // convert to normal String
        System.out.println("Final String result (toString()): " + result);
    }
}
