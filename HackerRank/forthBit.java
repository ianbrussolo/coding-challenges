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
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int fourthBit(int number) {
    // Write your code here
        String binaryString = Integer.toBinaryString(number);
        char[] binaryChar = binaryString.toCharArray();
        int[] binaryArr = new int[binaryChar.length];
        
        for (int i = 0; i < binaryArr.length; i++) {
           binaryArr[i] = Character.getNumericValue(binaryChar[i]);
        }
    
        if (binaryArr.length >= 4) {
            int digit = binaryArr[binaryArr.length - 4];
            return digit;
        } else {
            return 0;
        }
    }

}
public class forthBit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.fourthBit(number);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

