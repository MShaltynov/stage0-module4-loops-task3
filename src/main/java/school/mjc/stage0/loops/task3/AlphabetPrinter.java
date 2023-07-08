package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void main(String[] args) {
        int a='a';
        int z='z';
        System.out.println(a+" "+z);
    }
    public static void printAlphabet() {
        for (int i = 97; i <= 122; i++) {
            System.out.println((char)i);
        }
    }
}
