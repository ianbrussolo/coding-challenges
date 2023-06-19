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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int negativeCounter = 0;
        int positiveCounter = 0;
        int zeroCounter = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) * 1 > 0) {
                positiveCounter++;
            } else if (arr.get(i) * (-1) > 0) {
                negativeCounter++;
            } else if (arr.get(i) * 1 == 0) {
                zeroCounter++;
            }
        }
        
        double positiveRatio = (double) positiveCounter / arr.size();
        double negativeRatio = (double) negativeCounter / arr.size();
        double zeroRatio = (double) zeroCounter / arr.size();

        System.out.println(String.format("%.6f", positiveRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    }

}

public class plusMinusRatio {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
