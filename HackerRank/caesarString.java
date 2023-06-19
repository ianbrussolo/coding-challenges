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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
    public static int findAlphabetIndex (char[] charArray, char requested) {
        int i;
        for (i = 0; i < charArray.length; i++) {
            if (charArray[i] == requested) {
                return i;
            }
        }
        return i;
    }
    public static String caesarCipher(String s, int k) {
    // Write your code here
        //a - z / 97 - 122
        //A - Z / 65 - 90
        char[] alphabet = new char[26];
        for (int i = 97; i <= 122; i++) {
            int asciiInt = i;
            char asciiChar = (char) asciiInt;
            alphabet[i - 97] = asciiChar; 
        }
        
        char[] rotated = alphabet.clone();
        while (k > 0) {
            char temp = rotated[0];
            for (int j = 1; j < rotated.length; j++) {
                rotated[j - 1] = rotated[j];
            }
            rotated[rotated.length - 1] = temp;
            k--;
        }
        
        char[] string = s.toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (!(Character.isLetter(string[i]))) {
               continue;
            }
            int index = findAlphabetIndex(alphabet, Character.toLowerCase(string[i]));
            char caesarChar;
            if (Character.isUpperCase(string[i])) {
                caesarChar = Character.toUpperCase(rotated[index]);
            } else {
                caesarChar = rotated[index];
            }
            string[i] = caesarChar;
            
        }
        /* for (int x = 0; x < string.length; x++) {
            System.out.print(string[x]);   
        }
        System.out.println(); */
        String caesarString = new String(string);
        return caesarString;
    }

}

public class caesarString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

