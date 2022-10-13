public class Main {
    public static void main(String[] args) {
        // массив прибыли по месяцам
        long[] profit = {120, 300, 460, 1280, 500, 720,
                2050, 320, 7000, 600, 840, 350};
        SalesManager salesManager = new SalesManager(profit);
        System.out.println("Размер максимальной прибыли " +
                salesManager.max() + " руб.");
        System.out.println("Обрезанное среднее равно " + salesManager.cutMean());
    }
}