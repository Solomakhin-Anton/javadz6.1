import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void calculateSum() {
        Main.StatisticsService service = new Main.StatisticsService();

        //long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //long expected = 10_500;
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);

        System.out.println("Total:" + actual);
    }

  //  @Test
    //void findMax() {
      //  Main.StatisticsService service = new Main.StatisticsService();
//
  //      long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
    //    long expected = 5_000;
//
  //      long actual = service.findMax(purchases);
//
  //      assertEquals(expected, actual);
//
  //      System.out.println("Mean" + actual);
    //}

    @Test
    void findMean() {
        Main.StatisticsService service = new Main.StatisticsService();

        //long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
        //long expected = 5_000;

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findMean(purchases);
        long expected = 15;

        assertEquals(expected, actual);

        System.out.println("Mean: " + actual);

    }

    @Test
    void findTop() {
        Main.StatisticsService service = new Main.StatisticsService();

        //long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
        //long expected = 5_000;

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findTop(purchases);
        long expected = 8;

        assertEquals(expected, actual);

        System.out.println("Month: " + actual);



    }
}