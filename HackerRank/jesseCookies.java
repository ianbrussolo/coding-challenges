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
     * Complete the 'cookies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     */
    public static void printQueue (PriorityQueue<Integer> pq) {
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
    public static int cookies(int k, List<Integer> A) {
    // Write your code here
        List<Integer> filteredList = A.stream().filter(Objects::nonNull).collect(Collectors.toList());
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);
        /* if (pq.poll() >= k) {
            return 0;
        } */
        int count = 0;
        //poll - least priority element
        //peak - highest priority element
        while (pq.size() > 1 && pq.peek() < k) {
            /* PriorityQueue<Integer> copy = new PriorityQueue<>(pq);
            printQueue(copy); */
            int least = pq.poll();
            int secondLeast = pq.poll();
            int sweetness = least + 2 * secondLeast;
            pq.offer(sweetness);
            count++;
        }
        //System.out.println(pq.peek() + " is greater than " + k);
        if (!pq.isEmpty() && pq.peek() >= k) {
            return count;
        } else {
            return -1;
        }
    }

}

public class jesseCookies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
