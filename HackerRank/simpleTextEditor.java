import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class simpleTextEditor {
    private static Stack<String> history = new Stack<>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int q = Integer.parseInt(in.nextLine());
        //System.out.println("n of operations: " + q);
        StringBuilder sb = new StringBuilder();
        while (q > 0) {
            String line = in.nextLine();
            String[] parts = line.split("\\s+");
            int operation = Integer.parseInt(parts[0]);

            if (operation == 1) {
                sb.append(parts[1]); // append to StringBuilder
                history.push(sb.toString()); // push current state to history
            } else if (operation == 2) {
                int k = Integer.parseInt(parts[1]);
                int len = sb.length();
                sb.delete(len - k, len); // delete last k characters from StringBuilder
                history.push(sb.toString()); // push current state to history
            } else if (operation == 3) {
                int k = Integer.parseInt(parts[1]);
                System.out.println(sb.charAt(k - 1)); // print kth character of StringBuilder
            } else { // operation == 4 (undo)
                if (!history.isEmpty()) {
                    history.pop(); // pop current state from history
                    if (history.isEmpty()) {
                        sb.setLength(0); // if history is empty, reset StringBuilder to empty
                    } else {
                        sb.replace(0, sb.length(), history.peek()); // otherwise, set StringBuilder to previous state
                    }
                }
            }
            q--;
        }
    }
}

