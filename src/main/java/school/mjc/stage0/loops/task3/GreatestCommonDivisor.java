package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        printGCD(10, 15);
    }

    public static void printGCD(int first, int second) {
        if (first == 0 || second == 0) {
            System.out.println(first>second?first:second);
        } else {
            for (int i = first; i > 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
