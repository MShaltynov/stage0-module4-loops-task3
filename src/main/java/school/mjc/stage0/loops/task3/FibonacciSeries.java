package school.mjc.stage0.loops.task3;

public class FibonacciSeries {


    public  void printFibonacci(int lastFibonacci) {
        int k = 0;
        int l = 1;

        for (int i = 0; i < lastFibonacci; i++) {
            if(i==0){
                System.out.println(0);
            }
            else if(i==1){
                System.out.println(1);
            }else {
                int n = k + l;
                System.out.println(n);
                k = l;
                l = n;
            }

        }
    }
}
