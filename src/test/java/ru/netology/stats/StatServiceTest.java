package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
// Сумма всех продаж
    public void sumTest() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
// Средняя сумма продаж в месяц
    public void averageTest() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);


    }

    @Test
    //Последний месяц минимальных продаж
    public void minTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    //Последний месяц максимальных продаж
    public void maxTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 8;
        int actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    //Продажи ниже среднего
    public void belowAvengerTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Продажи выше среднего
    public void higherAvengerTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.higherAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}

