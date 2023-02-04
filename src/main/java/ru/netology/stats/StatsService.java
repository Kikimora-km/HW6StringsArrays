package ru.netology.stats;
public class StatsService {
    public long sumSeles(long [] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageSumSales (long [] sales) {
        long result = sumSeles(sales);
        return result/12;
    }

    public int maxSales (long [] sales) {
        int maxMounth = 0;
        long maxSale = sales [0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale ) {
                maxMounth = i;
                maxSale = sales [i];
            }
        }
        return maxMounth + 1;
    }

    public int minSales (long [] sales) {
        int minMounth = 0;
        long minSale = sales [0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale ) {
                minMounth = i;
                minSale = sales [i];
            }
        }
        return minMounth + 1;
    }

    public int mounthBellowAverage (long [] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < averageSumSales(sales)) {
                result++;
            }
        }
        return result;
    }

    public int mounthUpperAverage (long [] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > averageSumSales(sales)) {
                result++;
            }
        }
        return result;
    }
}
