package ru.netology.stats;

public class StatsService {
    // Сумма всех продаж
    public int sumSales(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public int averageSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        int average = sum / sales.length;
        return average;
    }

    //Последний месяц минимальных продаж
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    //Последний месяц максимальных продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    //Продажи ниже среднего
    public int belowAverageSales(int[] sales) {

        int average = averageSales(sales);
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales [i] < average) {
                amountMonth = amountMonth + 1;

            }
        }
        return amountMonth;
    }

    //Продажи выше среднего
    public int higherAverageSales(int[] sales) {

        int average = averageSales(sales);
        int amountMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                amountMonth = amountMonth + 1;

            }
        }
        return amountMonth;
    }

}





