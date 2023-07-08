package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        calculateSum(5);
    }
    public static void calculateSum(int lengthOfLastNumber) {
        String str="";
        int b=0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            str=str+"1";
            int a=Integer.parseInt(str)*9;
            b=a+b;

        }
        System.out.println(b);
    }
}
