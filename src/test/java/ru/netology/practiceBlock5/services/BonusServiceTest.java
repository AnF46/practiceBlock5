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
}
