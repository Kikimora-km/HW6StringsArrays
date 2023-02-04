package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StatsServiceTests {
    @Test
    public void testForSumSales () {
        StatsService service= new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.sumSeles(sales);
        long expected = 8 + 15 + 13 +15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(actual, expected);
    }

    @Test
    public void testAverageSumSales () {
        StatsService service= new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.averageSumSales(sales);
        long expected = (8 + 15 + 13 +15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        assertEquals(actual, expected);
    }

    @Test
    public void testForMaxSales () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(actual, expected);
    }

    @Test
    public void testForMinSales () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    public void testForMounthBellowAverage () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.mounthBellowAverage(sales);
        long expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    public void testForMounthUpperAverage () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.mounthUpperAverage(sales);
        long expected = 5;

        assertEquals(actual, expected);
    }
}
