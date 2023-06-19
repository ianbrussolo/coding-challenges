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

    /*
     * Complete the 'newPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String newPassword(String a, String b) {
    // Write your code here
        String newPsswrd = ""; 
    
        int i = 0;
        int j = 0; 
        
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        
        while (i < aChar.length 
            && j < bChar.length) { 
            newPsswrd += (String.valueOf(aChar[i]));
            i++;
            newPsswrd += (String.valueOf(bChar[j]));
            j++;
        }
        
        while (i < a.length()) {
            System.out.println("string b shorter than a");
            newPsswrd += (String.valueOf(aChar[i]));
            i++;
        }
        
        while (j < b.length()) { 
            System.out.println("string a shorter than b");
            newPsswrd += (String.valueOf(bChar[j]));
            j++;
        }
        //System.out.println(newPsswrd);
        
        return newPsswrd; 
    }



public class NewPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        String result = Result.newPassword(a, b);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

