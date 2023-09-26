public class AlphabetDiamond {
    public static void main(String[] args) {
        int row = 5;
        int s = 'A';
        
        for (int i = 1; i <= row; i++) {

            for (int k = row; k > i; k--) {

                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print((char) (s+j));
            }

            System.out.println();
        }

        for (int i = row - 1; i > 0; i--) {

            for (int k = row; k > i; k--) {

                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print((char) (s+j));
            }

            System.out.println();
        }
    }
}
