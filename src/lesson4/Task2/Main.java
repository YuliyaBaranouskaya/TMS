package lesson4.Task2;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1,4,5,6,7,3,0,-5,2,-12};
        WorkWithArr worker = new WorkWithArr();
        System.out.println(worker.findMax(arr));
        worker.findIndex(arr,3);
        worker.sortArr(arr);
        System.out.println("Sorted array:");
        for (int k=0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
