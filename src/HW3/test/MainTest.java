import HW3.main.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @ParameterizedTest
    @DisplayName("Проверка четности числа")
    @ValueSource(ints = {-13, 0, 14})
    public void numberIsEven(int n) {
        assertTrue(Main.evenOddNumber(n));
    }

    @ParameterizedTest
    @DisplayName("Проверка нечетности числа")
    @ValueSource(ints = {-13, 0, 14})
    public void numberIsOdd(int n) {
        assertFalse(Main.evenOddNumber(n));
    }

    @ParameterizedTest
    @DisplayName("Число попадает в интервал от 25 до 100")
    @ValueSource(ints = {13, 47, 99})
    public void numberInRange25To100(int n) {
        assertTrue(Main.numberInInterval(n));
    }

    @ParameterizedTest
    @DisplayName("Число не попадает в интервал от 25 до 100")
    @ValueSource(ints = {0, 13, 100})
    public void numberNotInRange25To100(int n) {
        assertFalse(Main.numberInInterval(n));
    }
}