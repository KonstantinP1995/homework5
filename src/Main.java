public class Main {
    public static void main(String[] args) {
        task1();
    }


    public static void task1() {
        //Задача 1

        int[] arrOne = new int[]{1, 2, 3};
        double[] arrTwo = {1.57, 7.654, 9.986};
        float[] arrThree = new float[3];
        arrThree[0] = 4;
        arrThree[1] = 2;
        arrThree[2] = 7;


        //Задача 2
        for (int i = 0; i < 3; i++) {
            System.out.printf(String.valueOf(arrOne[i]));
            if (i < (arrOne.length -1)) {
                System.out.printf(",");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            System.out.printf(String.valueOf(arrTwo[i]));
            if (i < (arrOne.length -1)) {
                System.out.printf(",");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            System.out.printf(String.valueOf(arrThree[i]));
            if (i < (arrOne.length -1)) {
                System.out.printf(",");
            }
        }
        System.out.println("\n");


        //Задача 3
        for (int i = 2; i >= 0; i--) {
            System.out.printf(String.valueOf(arrOne[i]));
            if (i > (arrOne.length -3)) {
                System.out.printf(",");
            }
        }
        System.out.println(" ");

        for (int i = 2; i >= 0; i--) {
            System.out.printf(String.valueOf(arrTwo[i]));
            if (i > (arrTwo.length -3)) {
                System.out.printf(",");
            }
        }
        System.out.println(" ");

        for (int i = 2; i >= 0; i--) {
            System.out.printf(String.valueOf(arrThree[i]));
            if (i > (arrThree.length -3)) {
                System.out.printf(",");
            }
        }
        System.out.println("\n");

        //Задача 4

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 != 0) {
                arrOne[i]++;
                System.out.printf(String.valueOf(arrOne[i]));
                System.out.printf(" ");
            } else {
                System.out.printf(String.valueOf(arrOne[i]));
                System.out.printf(" ");
            }
        }



    }
}