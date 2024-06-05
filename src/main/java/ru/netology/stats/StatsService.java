package ru.netology.stats;

public class StatsService {

    public long summary(long[] sales) {

        long summary = 0;
        for (long sale : sales) {
            summary = (long) (summary + sale);
        }
        return summary;
    }

    public long calcAverage(long[] sales) {
        return (long) (summary(sales) / sales.length);

    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth + 1;

    }

    public long amountMonthUnderAvg(long[] sales) {
        int count = 0;
        long salesAvg = calcAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                count++;
            }
        }
        return count;
    }

    public long amountMonthOverAvg(long[] sales) {
        int count = 0;
        long salesAvg = calcAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAvg) {
                count++;
            }
        }
        return count;
    }

}