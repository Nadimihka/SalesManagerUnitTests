import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: SalesManager")

public class SalesManagerTest {
    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(new long[]{
                1, 2, 3, 4, 5
        });
   //     System.out.println("Вызываюсь до выполнения теста");
    }

    @Test
    @DisplayName("Тестирование вычисления максимального значения: max")
    void max() {
        Assertions.assertEquals(5, salesManager.max());
    }

    @Test
    @DisplayName("Тестирование вычисления минимального значения: min")
    void min() {
        Assertions.assertEquals(1, salesManager.min());
    }

    @Test
    @DisplayName("Тестирование вычисления обрезанного среднего: cutMean")
    void cutMean() {
        Assertions.assertEquals(3, salesManager.cutMean());
    }

    @Test
    @DisplayName("Тестирование деления на ноль при вычислении обрезанного среднего: cutMean")
    void cutMean_ofJustTwoElements() {
        SalesManager salesManager = new SalesManager(new long[]{1, 2});
        Assertions.assertThrows(ArithmeticException.class, salesManager::cutMean);
    }
}
