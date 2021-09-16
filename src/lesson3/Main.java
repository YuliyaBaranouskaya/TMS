package lesson3;


class Main {
    public static void main(String[] args) {

//        Создать массив на n-элементов и заполнить его числами фиббоначи.

       Task1FibonacciNumbers numbers = new Task1FibonacciNumbers();
        numbers.printFibonacciNumbers();

//        В произвольном массиве найти сумму минимального и максимального элементов.

        Task2SumMinMax sum = new Task2SumMinMax();
        sum.sumNimMaxArr();

//        Найти разницу между суммой элементов стоящих на четных и нечетных местах.

        Task3 diff = new Task3();
        diff.differenceBetweenEvenAndOdd();

//        В произвольном числовом массиве найти число, которое встречается чаще всего.
//                Вывести это число и количество раз, сколько число встречается
//        (если несколько чисел встречаются одинаковое количество раз – вывести любое из них).

        Task4 find = new Task4();
        find.findDuplicate();


    }
}