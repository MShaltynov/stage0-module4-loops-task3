package school.mjc.stage0.loops.task3;

public class RangeSum {
    public static void main(String[] args) {
        printSumInclusive(3,5);
    }
    public static void printSumInclusive(int firstBoarder, int secondBoarder) {
        int k=0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            k+=i;

        }
        System.out.println(k);
    }
}
