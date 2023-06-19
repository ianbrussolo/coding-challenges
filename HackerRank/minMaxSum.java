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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    //could have been done by sorting the array
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                sum += arr.get(j);
            }
            sum -= arr.get(i);
            //System.out.println(sum);
            if (i == 0) minSum = sum;
            if (sum < minSum) minSum = sum;
            if (sum > maxSum) maxSum = sum;
            //System.out.println("    max para " + arr.get(i) + ": " + maxSum);
            //System.out.println("    min para " + arr.get(i) + ": " + minSum);
        }
        System.out.println(minSum + " " + maxSum);
    }

}

public class minMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
