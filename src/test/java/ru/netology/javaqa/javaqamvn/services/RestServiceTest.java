package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/RestMoney.csv")
    public void RestCulcMounths(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        int actual = service.calcReset(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
