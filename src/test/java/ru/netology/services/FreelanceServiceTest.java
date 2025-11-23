package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelanceServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/freelance-data.csv", numLinesToSkip = 1)
    void shouldCalculateRelaxMonths(int expected,
                                    int income,
                                    int expenses,
                                    int threshold) {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
