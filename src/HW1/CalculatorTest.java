import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100);
        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 101)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -1)).isInstanceOf(ArithmeticException.class);
    }

    @Test
    void calculateCostAfterDiscount() {
        assertThat(Calculator.calculateDiscount(100, 10)).isEqualTo(90);
    }
}