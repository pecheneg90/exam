package pro.sky.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] massive = {1, 2, 3, 4};
        for (int i = 0; i < massive.length / 2; i++) {
            System.out.println(Arrays.toString(massive));

            int temp = massive[i]; // временное хранилище
            System.out.println(temp + " - значение во временном хранилище");

            massive[i] = massive[massive.length - i - 1]; // замена значения в первой ячейке, значением из последней ячейки массива
            System.out.println(temp + " заменено на " + massive[i]);

            massive[massive.length - i - 1] = temp; // в последнюю ячейку помещен элемент из временного хранилища
            System.out.println(massive[i] + " заменено на " + temp);
        }
        System.out.println(Arrays.toString(massive));
    }
}