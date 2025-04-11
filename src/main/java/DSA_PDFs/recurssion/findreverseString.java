package DSA_PDFs.recurssion;

public class findreverseString {

//    Now we return back up the recursive stack:
//    Call 4: reverse("lo") = "o" + "l" = "ol"
//
//    Call 3: reverse("llo") = "ol" + "l" = "oll"
//
//    Call 2: reverse("ello") = "oll" + "e" = "olle"
//
//    Call 1: reverse("hello") = "olle" + "h" = "olleh"

    public static String reverse(String str) {
        // Base case: if string is empty or has one character
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case: reverse the rest of the string and append first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed); // Output: "olleh"
    }
}
