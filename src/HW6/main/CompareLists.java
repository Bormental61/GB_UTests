/*
Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.
*/

package HW6;

import java.util.ArrayList;
import java.util.List;

public class CompareLists {
    public double average(List<Integer> request) {
        return request.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public String compareListsAverage(List<Integer> firstList, List<Integer> secondList) {
        double averageFirstList = average(firstList);
        double averageSecondList = average(secondList);

        if (averageFirstList > averageSecondList) {
            return "Первый список имеет большее среднее значени";
        } else if (averageFirstList < averageSecondList) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}