package ru.netology.stats;

public class StatsService {

    public int summary(int[] sales) {

        int summary = 0;
        for (int sale : sales) {
            summary = summary + sale;
        }
        return summary;
    }

    public int calcAverage(int[] sales) {
        return summary(sales) / sales.length;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth +1;

    }

    public int amountMonthUnderAvg(int[] sales) {
        int count = 0;
        int salesAvg = calcAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthOverAvg(int[] sales) {
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