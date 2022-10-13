public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Long.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long cutMean() {
        //обрезанное среднее
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        if (sales.length == 2) {throw new ArithmeticException("Для вычисление " +
                "обрезанного среднего количество элементов должно быть больше 2");}
        return (sum - max() - min()) / (sales.length - 2);
    }
}
