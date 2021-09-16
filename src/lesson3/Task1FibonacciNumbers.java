package lesson3;

public class Task1FibonacciNumbers {
    public void printFibonacciNumbers () {
        int [] arr = new int[20];
        for (int i=0; i<arr.length;i++) {
            if (i < 2) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.println(arr[i] + "");
        }
    }
}
