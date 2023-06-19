package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1173 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);

    int[] array = new int[10];
    array[0] = in.nextInt();
    
    for(int i = 1; i < array.length; i++) {
        array[i] = array[i - 1]*2;
    }
    for (int i = 0; i < array.length; i++) {
        System.out.println("N[" + i + "] = " + array[i]);
    }

    }
}