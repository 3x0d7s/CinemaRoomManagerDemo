package cinema;

import java.util.Arrays;

public class Cinema {
    public static void main(String[] args) {
        //outputTheArrangement(7, 8);
        Calculator.calculateIncome();
    }
    
    static void outputTheArrangement(int rows, int columns) {
        int[] rowsArr = createArrWithOrderNumbers(rows);
        int[] columnsArr = createArrWithOrderNumbers(columns);
        char[][] seats = new char[rows][columns];
        fillSeatsArr(seats);

        System.out.print("Cinema:\n  ");
        for (int index = 0; index < columns ; index++) {
            System.out.print(columnsArr[index]);
            if (index != columns - 1) System.out.print(" ");
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(rowsArr[i] + " ");
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j]);
                if(j != columns - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static int[] createArrWithOrderNumbers(int len) {
        int[] result = new int[len];
        for(int index = 0; index < len; index++) {
            result[index] = index + 1;
        }
        return result;
    }

    static void fillSeatsArr(char[][] arr) {
        for(char[] row: arr){
            Arrays.fill(row, 'S');
        }
    }

}