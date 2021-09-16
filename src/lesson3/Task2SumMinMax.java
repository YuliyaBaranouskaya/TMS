package lesson3;

public class Task2SumMinMax {
    public void sumNimMaxArr() {
        int[] arr = {1, 3, 6, -9, 5, 2, 4, -10, 12};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min + Max = " + (min+max));
    }
}
