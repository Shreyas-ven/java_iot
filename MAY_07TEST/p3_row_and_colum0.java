import java.util.*;

class p3_row_andcolum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        boolean[] rowZero = new boolean[r];
        boolean[] colZero = new boolean[c];

        // Input + marking
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Modify matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (rowZero[i] || colZero[j]) {
                    mat[i][j] = 0;
                }
            }
        }

        // Output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}