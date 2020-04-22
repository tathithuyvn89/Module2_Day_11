package thuchanh_kiemtra_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {
    public static void main(String[] args) {
        Queue<Character> queue= new LinkedList<>();
        Stack<String> stack= new Stack<String>();
        String string= "Able was I ere I saw Elba";
        for (int i =0; i<string.length()/2;i++){
            queue.add(string.charAt(i));
        }
        for (int i =string.length()-1; i>string.length()/2;i--){
            stack.add(String.valueOf(string.charAt(i)));
        }
        if (stack.toString().equalsIgnoreCase(queue.toString())) {
            System.out.println("This String is Palindrome ");
        } else {
            System.out.println("This String is not Palindrome");
        }

    }
}
