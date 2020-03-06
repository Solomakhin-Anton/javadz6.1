public class Main {

    public static class StatisticsService {
        public long calculateSum(long[] purchases) {
            long sum = 0;
            for (long purchase : purchases) {
                // аналог sum = sum + purchase;
                sum += purchase;
            }
            return sum;

        }

        //   public long findMax(long[] purchases) {
        //     long currentMax = purchases[0];
        //   for (long purchase : purchases) {
        //     if (currentMax < purchase) {
        //       currentMax = purchase;
        // }
        //}
        //return currentMax;
        //}

        public long findMean(long[] purchases) {
            long sum = 0;
            for (long purchase : purchases) {
                sum = sum + purchase;

            }

            long mean = sum / 12;

            return mean;
        }

        public long findTop(long[] purchases) {
            long currentMax = purchases[0];
            long month = 1;
            for (long purchase : purchases) {
                if (currentMax <= purchase) {
                    currentMax = purchase;
                    month = month + 1;
                }

            }


            return month;
        }
    }

    }