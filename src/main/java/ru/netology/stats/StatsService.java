package ru.netology.stats;

public class StatsService {

    public int summary(long[] sales) {

        int summary = 0;
        for (long sale : sales) {
            summary = (int) (summary + sale);
        }
        return summary;
    }

    public int calcAverage(long[] sales) {
        return summary(sales) / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth + 1;

    }

    public int amountMonthUnderAvg(long[] sales) {
        int count = 0;
        int salesAvg = calcAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthOverAvg(long[] sales) {
        int count = 0;
        int salesAvg = calcAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAvg) {
                count++;
            }
        }
        return count;
    }

}