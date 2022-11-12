package ru.mirea.lab19_20;
import java.util.Collections;

public class App {

    public static void searchOutput(
            String searchDescr,
            boolean found,
            double time
    ) {
        System.out.println(
                searchDescr +
                        ": номер " +
                        (found ? "" : "не ") +
                        "найден, поиск занял " +
                        time +
                        "нс"
        );
    }

    public static void main(String[] args) {
        CarNum carNum = new CarNum();

        for (int i = 0; i < 10; i++) {
            carNum.generate();
        }
        System.out.println(carNum.getNumbers()); //показ массива

        String testNumber = carNum.getNumbers().get(4);
        System.out.println("\n" + "Номер для поиска: " + testNumber);

        Collections.sort(carNum.getNumbers());

        boolean sortRes;
        long m;

        m = System.nanoTime();
        sortRes = carNum.straightSearch(testNumber);
        searchOutput(
                "Поиск перебором",
                sortRes,
                (double) (System.nanoTime() - m)
        );

        m = System.nanoTime();
        sortRes = carNum.binarySearch(testNumber);
        searchOutput("Бинарный поиск", sortRes, (double) (System.nanoTime() - m));

        m = System.nanoTime();
        sortRes = carNum.hashSetSearch(testNumber);
        searchOutput(
                "Поиск в HashSet",
                sortRes,
                (double) (System.nanoTime() - m)
        );

        m = System.nanoTime();
        sortRes = carNum.treeSetSearch(testNumber);
        searchOutput(
                "Поиск в TreeSet",
                sortRes,
                (double) (System.nanoTime() - m)
        );
    }
}