package lesson4.Task2;

//Создать класс для работы с  массивами чисел.
// Создать методы для сортировки, нахождения максимального элемента,
// поиска номера элемента в массиве по его значению (любое вхождение).
// Всю общую логику вынести в приватные методы.

public class WorkWithArr {

    public int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public void sortArr(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void findIndex(int[] arr, int value){
        int index = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        printIndex(index);
    }

    private void printIndex(int index){
        if (index != -1){
            System.out.println(index);
        } else {
            System.out.println("Not found");
        }
    }
}

