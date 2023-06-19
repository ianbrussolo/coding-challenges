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
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */


    public static String gridChallenge(List<String> grid) {
    // Write your code here
        for (int i = 0; i < grid.size(); i++) {
            char[] row = grid.get(i).toCharArray();
            Arrays.sort(row);
            String strRow = String.valueOf(row);
            grid.set(i, strRow);
        }
        /* for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).length(); j++) {
                System.out.print(grid.get(i).charAt(j));
            }
            System.out.println();
        } */
        for (int j = 0; j < grid.get(0).length(); j++) {
            for (int i = 1; i < grid.size(); i++) {
                if(grid.get(i - 1).charAt(j) > grid.get(i).charAt(j)) {
                    return "NO";  
                }
            }
        }
        return "YES"; 
        
    }


}


public class gridChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        int t = Integer.parseInt(bufferedReader.readLine().trim());


        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());


                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());


                String result = Result.gridChallenge(grid);


                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        bufferedReader.close();
        bufferedWriter.close();
    }
}



