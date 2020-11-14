package com.company;

public class Main {

    public static void main(String[] args) {
        // Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
        //Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных
        // после первого отрицательного числа и вывести его на экран

        double[] numbers = {5.4, 14.7, -75.76, 56.14, -99.12, 512.42, 512.42, -32.62, 1.92, -12.2, 63.1, 82.65, -111.42, 632.82, 112.5,};
        double result = 0;
        for (double additionNumbers:numbers) {
            if (additionNumbers > 0){
                result += additionNumbers;
                continue;
            }
            System.out.println("Среднее арифметическое число " + result / numbers.length);
        }
    }
}
