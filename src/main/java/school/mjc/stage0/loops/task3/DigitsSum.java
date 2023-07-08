package school.mjc.stage0.loops.task3;

public class DigitsSum {


    public static void printDigitsSum(int t) {
        String numberString = t + "";
        int sum = 0;
        int sign=1;
        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            if (digitChar!='-'){
                int c = digitChar - '0';
                sum += c;
            }

        }
        System.out.println(sum*sign);
    }
}
