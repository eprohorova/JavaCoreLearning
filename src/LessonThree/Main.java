package LessonThree;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Задача 1. Написать метод, который меняет два элемента массива местами.
        String[] arr = {"asd", "ds", "ret", "123"};
        //Integer[] arr = {3, 4, 6, 234, -1324, 111};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));


        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = convertToList(arr);
        System.out.println("Task 2\n" + list.getClass() + " : " + list);


        //Задача 3. Коробки с фруктами
        System.out.println("Task 3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBoxOne = new Box();
        Box<Orange> orangeBoxTwo = new Box();
        Box<Apple> appleBox = new Box();
        orangeBoxOne.add(new Orange());
        orangeBoxOne.add(new Orange());
        orangeBoxOne.add(new Orange());
        for (int i = 0; i < 4; i++) {
            orangeBoxTwo.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBoxOne.info();
        orangeBoxTwo.info();
        appleBox.info();

        Float orangeOneWeigth = orangeBoxOne.getWeight();
        Float orangeTwoWeigth = orangeBoxTwo.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки номер один с апельсинами: " + orangeOneWeigth);
        System.out.println("Вес коробки номер два с апельсинами: " + orangeTwoWeigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес коробки с амельсинами номер один и коробку с яблоками: " + orangeBoxOne.compare(appleBox));
        System.out.println("Сравнить вес коробки с апельсинами номер два и коробку с яблоками: " + orangeBoxTwo.compare(appleBox));

        orangeBoxOne.moveAt(orangeBoxTwo);
        orangeBoxOne.info();
        orangeBoxTwo.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int indexOne, int indexTwo) {
        T temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
