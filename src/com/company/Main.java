package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
        // Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных
        // после первого отрицательного числа и вывести его на экран
        double[] numbers = {5.4, 14.7, -75.76, 56.14, -99.12, 512.42, 512.42, -32.62, 1.92, -12.2, 63.1, 82.65, -111.42, 632.82, 112.5,};
        double result = 0;
        double positiveResult = 0;
        int count = 0;

        boolean negativeNumber = false;

        for (double additionNumbers:numbers) {
            if (additionNumbers < 0 ){
                negativeNumber = true;
                continue;
            }
            else if (negativeNumber && additionNumbers > 0) {
                positiveResult += additionNumbers;
                count++;
            }
            result = positiveResult / count;

        }
        System.out.println("Вот сами числа " + positiveResult);
        System.out.println("Вот положительный результат " + count);
        System.out.println("Вот среднее число количества массива " + result);

        // Дополнительная задача

        for (int i = 0; i < numbers.length; i++) {
            double onTheTruck = numbers[i];
            int a = i - 1;
            while (a >= 0 && onTheTruck < numbers[a]) {
                numbers[a + 1] = numbers[a];
                a--;
            }
            numbers[a + 1] = onTheTruck;
            System.out.println(Arrays.toString(numbers));
        }

    }

}
