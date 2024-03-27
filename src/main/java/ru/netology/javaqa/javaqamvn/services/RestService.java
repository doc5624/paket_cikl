package ru.netology.javaqa.javaqamvn.services;

public class RestService {
    public int calcReset(int income, int expenses, int threshold) {
        int amountCash = 0;
        int countMonth = 0;
        for (int i = 1; i <= 12; i++) {
            if (amountCash >= threshold) {
                amountCash = (amountCash - expenses) / 3;
                countMonth = countMonth + 1;
            } else {
                amountCash = amountCash + income - expenses;
            }
        }
        return countMonth;
    }
}
