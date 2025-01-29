public class DiamondPattern {
        public static void main(String[] args) {
            int n = 5; // number of rows
            printDiamond(n);
        }
    
        public static void printDiamond(int n) {
            // print upper half of the diamond
            for (int i = 0; i < n; i++) {
                // print spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                // print stars
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    
            // print lower half of the diamond
            for (int i = n - 2; i >= 0; i--) {
                // print spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                // print stars
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
