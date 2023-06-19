import java.io.File;
import java.util.*;
import java.net.URL;
import java.io.*; 

public class csvReader {
    public static long average (List<String[]> lines) {
        long sum = 0;
        for (int i = 1; i < lines.size(); i++) {
            long id = Long.parseLong(lines.get(i)[0]);
            sum += id;
        }
        return (sum)/(lines.size() - 1);
    }

    public static long greaterId (List<String[]> lines) {
        long greater = Long.parseLong(lines.get(1)[0]);
        //System.out.println(greater);
        for (int i = 2; i < lines.size(); i++) {
            long id = Long.parseLong(lines.get(i)[0]);
            if (id > greater) {
                //System.out.println("new greater: " + id);
                greater = id;
            }
        }
        return greater;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("D:\\202304181011198.csv"));
        List<String[]> lines = new ArrayList<String[]>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            //System.out.println(line);
            String[] arr = new String[30];
            arr = line.split(";");
            //System.out.println(arr);
            lines.add(arr);          
        }
        long average = average(lines);
        long greater = greaterId(lines);
        System.out.println(greater);
    }
    
}
