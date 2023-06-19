public class countingSort {
    //counting sort 1
    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        int[] frequency = new int[100];
        Arrays.fill(frequency, 0);
        
        List<Integer> result = new ArrayList<Integer>();
        for (Integer j : arr) {
            frequency[j]++;
        }
        
        for (int x = 0; x < 100; x++) {
            result.add(frequency[x]);
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
