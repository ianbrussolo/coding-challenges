import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static boolean verifyPalindrome (String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static void printList (List<Character> charList) {
        for (Character c : charList) {
            System.out.print(c + " ");
        }
    }
    
    public static int palindromeIndex(String s) {
        int i = 0, j = s.length() - 1;
        //System.out.println(s);
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                //if the pair is not equal, verify if the string without i or j is a palindrome
                if (verifyPalindrome(s.substring(i + 1, j + 1))) {
                    //System.out.println(s.substring(i + 1, j + 1));
                    return i;
                } else if (verifyPalindrome(s.substring(i, j))) {
                    //System.out.println(s.substring(i, j));
                    return j;
                } else {
                    return -1;
                }
            }
            i++;
            j--;
        }
        return -1;
    }

}
public class palindromeIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
