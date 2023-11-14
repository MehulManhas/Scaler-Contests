import java.util.Arrays;
import java.util.Scanner;

public class MatrixGameII {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        String params = sc.nextLine();

        int n = params.charAt(0) - '0';
        int m = params.charAt(2) - '0';
        int q = params.charAt(4) - '0';


        int[][] matrix = createMatrix(n, m);

        while (sc.hasNext()){
            String command = sc.nextLine();

            int operation = command.charAt(0) - '0';

            if (operation == 1){
                int col1 = command.charAt(2) -'0';
                int col2 = command.charAt(4) -'0';
                swapColumns(col1-1, col2-1, matrix);
            }
            else if (operation == 2){
                int row1 = command.charAt(2) -'0';
                int row2 = command.charAt(4) -'0';
                swapRows(row1-1, row2-1, matrix);
            }
            else if(operation == 3){
                int row1 = command.charAt(2) -'0';
                int col1 = command.charAt(4) -'0';
                int row2 = command.charAt(6) -'0';
                int col2 = command.charAt(8) -'0';

                System.out.println(calculateBitwiseOr(row1-1, col1-1, row2-1, col2-1, matrix));
            }
            else if(operation == 4){
                int row1 = command.charAt(2) -'0';
                int col1 = command.charAt(4) -'0';
                int row2 = command.charAt(6) -'0';
                int col2 = command.charAt(8) -'0';

                System.out.println(calculateBitwiseAnd(row1-1, col1-1, row2-1, col2-1, matrix));
            }
        }

    }

    public static int[][] createMatrix(int row, int col){

        int[][] matrix = new int[row][col];

        int num = 1;

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j] = num;
                num++;
            }
        }

        return matrix;
    }

    public static void swapColumns(int col1, int col2, int[][] matrix){

        for(int i=0; i<matrix.length; i++){
            int temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }

    }

    public static void swapRows(int row1, int row2, int[][] matrix){

        for(int i=0; i<matrix[0].length; i++){
            int temp = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = temp;
        }
    }



    public static int calculateBitwiseOr(int row1, int col1, int row2, int col2, int[][] matrix){
        return matrix[row1][col1] | matrix[row2][col2];
    }

    public static int calculateBitwiseAnd(int row1, int col1, int row2, int col2, int[][] matrix){
        return matrix[row1][col1] & matrix[row2][col2];
    }
}
