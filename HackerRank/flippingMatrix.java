import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.lang.Object;
import java.util.Collections;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */
    /* public static void flipRow (List<List<Integer>> matrix, int i) {
        int numColumns = matrix.get(0).size();
        for (int j = 0; j < numColumns; j++) {
            int temp = matrix.get(i).get(j);
            matrix.get(i).set(j, matrix.get(i).get(numColumns - 1 - j));
            matrix.get(i).set(numColumns - 1 - j, temp);
        }
    }
    public static void flipColumn (List<List<Integer>> matrix, int j) {
        int numRows = matrix.size();
        for (int i = 0; i < numRows; i++) {
            int temp = matrix.get(i).get(j);
            matrix.get(i).set(j, matrix.get(numRows - 1 - i).get(j));
            matrix.get(numRows - 1 - i).set(j, temp);
        }
    }
    public static int verifySum (List<List<Integer>> matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.size()/2; i++) {
            for (int j = 0; j < matrix.size()/2; j++) {
                sum += matrix.get(i).get(j);
            }
        }
        return sum;
    }
    public static boolean verifyColumnTop (List<List<Integer>> matrix, int j) {
        int topSum = 0;
        int bottomSum = 0;
        int c = 0;
        for (int i = 0; i < matrix.size()/2; i++) {
            //bottom iterator
            c = matrix.get(0).size()/2 + i;
            topSum += matrix.get(i).get(j);
            bottomSum += matrix.get(c).get(j);
            c++;
        }
        if (topSum > bottomSum) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean verifyRowLeft (List<List<Integer>> matrix, int i) {
        int leftSum = 0;
        int rightSum = 0;
        int c = 0;
        for (int j = 0; j < matrix.size()/2; j++) {
            //right iterator
            c = matrix.size()/2 + j;
            leftSum += matrix.get(i).get(j);
            rightSum += matrix.get(c).get(j);
            c++;
        }
        if (leftSum > rightSum) {
            return true;
        } else {
            return false;
        }
    } */
    public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
        /* for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        } 
        for (int j = 0; j < matrix.get(0).size(); j++) {
            if (!(verifyColumnTop(matrix, j))) {
                flipColumn(matrix, j);
            } 
        }  
        for (int i = 0; i < matrix.size(); i++) {
            if (!(verifyRowLeft(matrix, i))) {
                flipRow(matrix, i);
            } 
        }   
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }    
        return 1; */
        //https://www.blogoncode.com/2022/08/flipping-matrix-solution-in-java.html
        int sum = 0;
        int size = matrix.size();
        for (int i = 0; i < size/2; i++) {
            for (int j = 0; j < size/2; j++) {
                sum += Math.max( matrix.get(i).get(j), 
                    Math.max( matrix.get(i).get(size-1-j),
                    Math.max( matrix.get(size-1-i).get(j), 
                        matrix.get(size-1-i).get(size-1-j))
                    )  
                );
            }            
        }
        return sum;
    }

}
public class flippingMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

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
