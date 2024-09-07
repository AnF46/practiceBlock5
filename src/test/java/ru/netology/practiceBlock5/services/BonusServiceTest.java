package ru.netology.practiceBlock5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/BonusServiceData.csv")
    public void test(String name, long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        /*long amount = 1000;
        boolean registered = true;
        long expected = 30;*/

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    /*@Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notRegisteredOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void notRegisteredLimitNumberBorder() {
        BonusService service = new BonusService();

        long amount = 500;
        boolean registered = false;
        long expected = 5;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }*/


}
