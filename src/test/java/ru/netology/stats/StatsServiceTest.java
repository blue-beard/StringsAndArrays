package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSum() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.summary(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldCalculateAverage() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.calcAverage(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldSumMaxMonth() {

        StatsService service = new StatsService();
        int[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(maxMonth);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldSumMinMonth() {

        StatsService service = new StatsService();
        int[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(minMonth);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldAmountMonthUnderAverage() {

        StatsService service = new StatsService();
        int[] amountMonthUnderAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.amountMonthUnderAvg(amountMonthUnderAverage);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldAmountMonthOverAverage() {

        StatsService service = new StatsService();
        int[] amountMonthOverAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.amountMonthOverAvg(amountMonthOverAverage);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}


