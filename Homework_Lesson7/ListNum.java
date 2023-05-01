package Homework_Lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListNum {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }
        System.out.print("2. " + numbers + " ");
        System.out.println();

        // 3.

        int temp = 0;
        int size = numbers.size();
        long timeBefore = System.currentTimeMillis();
        for (Integer num : numbers) {
            num = temp;
        }
        System.out.print("3. " + numbers + " ");
        System.out.println();
        long timeAfter = System.currentTimeMillis();
        System.out.println((double)(timeAfter - timeBefore));
        // 4.
        long timeBefore2 = System.currentTimeMillis();
        for (int i = 0; i < numbers.size(); i++) {
            temp = i+1;
            numbers.set(i, temp);

        }
        System.out.println("4. " + numbers + " ");
        long timeAfter2 = System.currentTimeMillis();
        System.out.println((double)(timeAfter2 - timeBefore2));

        // 5.
        long timeBefore3 = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            temp = i+1;
            numbers.set(i, temp);
        }
        System.out.println("5. " + numbers + " ");
        long timeAfter3 = System.currentTimeMillis();
        System.out.println((double)(timeAfter3 - timeBefore3));

        // 6.
        long timeBefore4 = System.currentTimeMillis();
        for (int i = size-1; i >= 0; i--) {

            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        long timeAfter4 = System.currentTimeMillis();
        System.out.println((double)(timeAfter4 - timeBefore4));

        // 7.
        long timeBefore5 = System.currentTimeMillis();
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            System.out.print(temp + " ");
        }
        System.out.println();
        long timeAfter5 = System.currentTimeMillis();
        System.out.println((double)(timeAfter5 - timeBefore5));

        // 8.
        long timeBefore6 = System.currentTimeMillis();
        ListIterator<Integer> iterator2 = numbers.listIterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();
        while (iterator2.hasPrevious()) {
            System.out.print(iterator2.previous() + " ");
        }
        System.out.println();
        long timeAfter6 = System.currentTimeMillis();
        System.out.println((double)(timeAfter6 - timeBefore6));




    }
}
/*
* 1. Создать лист.


2. В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)

3. Перебрать лист с помощью for-each, в цикле каждое значение листа записать в переменную temp.

4. Сделать то же самое с помощью классического for.

5. Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.

6. Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.

7. Сделать то же самое, но используя Iterator.

8. Сделать то же самое, но используя ListIterator.
Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл:

Замеряете текущее время до цикла с помощью метода System.currentTimeMillis();

Замеряете текущее время после цикла с помощью метода System.currentTimeMillis();

Выводите разницу во времени после и до в консоль.

* */