package ru.netology.javaqa.javaqamvn.services;

public class RestService {
    public int calcReset(int income, int expenses, int threshold) {
        int amount_cash = 0;
        int count_month = 0;
        for (int i = 1; i <= 12; i++) {
            if (amount_cash >= threshold) {
                amount_cash = (amount_cash - expenses) / 3;
                count_month = count_month + 1;
            }
            else {
                amount_cash = amount_cash + income - expenses;
            }
        }
        return count_month;
    }
}
