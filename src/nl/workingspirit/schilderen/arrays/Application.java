package nl.workingspirit.schilderen.arrays;

public class Application {

    public static void main(String[] args) {


        // 0,1,1,2,3,5,8,13,21,34,55

        int[] reeks = new int[11];
        reeks[0] = 0;
        reeks[1] = 1;
        reeks[2] = 1;
        reeks[3] = 2;
        reeks[4] = 3;
        reeks[5] = 5;

        int[] andereReeks = new int[]{0, 1, 2};
        int[] nogEenAndereReeks = {4, 5, 6};

        System.out.println(andereReeks.toString());

//        foo(nogEenAndereReeks);

        String[] names = {"Mark", "Ghislaine", "Justin"};

        for (String name : names) {

            System.out.println(name);
        }

        System.out.println(fibon(10));

        long[] fibon = new long[50];
        fibon[0] = 0;
        fibon[1] = 1;
        for (int i = 2; i < fibon.length; i++) {
            fibon[i] = fibon[i - 1] + fibon[i - 2];
        }

        System.out.println(fibon[49]);


        int sum = 0;
        for (int element : nogEenAndereReeks) {
            sum += element;
        }

        System.out.println(sum);


        int[] getallen[] = new int[3][];

        getallen[1] = new int[3];

        for(int i = 0;i < getallen.length;i++) {
            System.out.println(getallen[i]);
        }


    }

    public static long fibon(long n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibon(n - 1) + fibon(n - 2);
        }
    }
}