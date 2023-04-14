public class PatternPiramid {
    public static void main(String[] args) {
        int size = 5;


        for (int row = 0; row < size; row++) {
            for (int space = size-1; space > row; space--)
                System.out.print("  ");

            for (int star = 1; star <= row * 2 + 1; star++)
                System.out.print("* ");
            System.out.println();


        }

    }
}

//
//public class DiamondShape {
//    public static void main(String[] args) {
//        int n = 5; // Number of rows in the diamond
//        int i, j, space = 1;
//
//        // Upper half of diamond
//        space = n - 1;
//        for (j = 1; j <= n; j++) {
//            for (i = 1; i <= space; i++) {
//                System.out.print(" ");
//            }
//            space--;
//            for (i = 1; i <= 2 * j - 1; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//        // Lower half of diamond
//        space = 1;
//        for (j = 1; j <= n - 1; j++) {
//            for (i = 1; i <= space; i++) {
//                System.out.print(" ");
//            }
//            space++;
//            for (i = 1; i <= 2 * (n - j) - 1; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}
