package ru.netology.services;

public class FreelanceService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;   // сколько денег на счету
        int count = 0;   // сколько месяцев отдыха было

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // месяц отдыха:
                // сначала обязательные траты,
                // затем отдых так, что остаётся треть средств
                money = (money - expenses) / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                // месяц работы: заработал income, потратил expenses
                money = money + income - expenses;
            }
        }

        return count;
    }
}
