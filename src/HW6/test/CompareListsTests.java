/*
Используйте Pytest (для Python) или JUnit (для Java) для написания тестов,
которые проверяют правильность работы программы.
Тесты должны учитывать различные сценарии использования вашего приложения.
Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.
Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.
*/

package HW6;

import HW6.main.CompareLists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareListsTests {
    CompareLists compareLists;

    private final List<Integer> firstList = Arrays.asList(7,13,9,17,3);
    private final List<Integer> secondList = Arrays.asList(1,2,3,33,55);
    private final List<Integer> emptyList = new ArrayList<>();

    @BeforeEach
    void testinit() {
        compareLists = new CompareLists();
    }

    @Test
    void UTestAverageLists(){
        assertEquals(compareLists.average(firstList), 9.8);
    }

    @Test
    void UTestAverageEmptyList(){
        assertEquals(compareLists.average(emptyList), 0.0);
    }

    @Test
    void ITestCompareListsAverageSecond(){
        assertEquals(compareLists.compareListsAverage(firstList, secondList), "Второй список имеет большее среднее значение");
    }

    @Test
    void ITestCompareListsAverageFirst(){
        assertEquals(compareLists.compareListsAverage(secondList, firstList), "Первый список имеет большее среднее значение");
    }

    @Test
    void ITestCompareListsAverage(){
        assertEquals(compareLists.compareListsAverage(firstList, firstList), "Средние значения равны");
    }
}