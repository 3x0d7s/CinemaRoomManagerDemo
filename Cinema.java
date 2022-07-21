package cinema;

import java.util.Arrays;

public class Cinema {
    public static void main(String[] args) {
        int[] rows = createArrWithOrderNumbers(7);
        int[] columns = createArrWithOrderNumbers(8);
        //char[][] seats = new char[7][8];
        //fillSeatsArr(seats);

        System.out.print("Cinema:\n  ");
        for (int index = 0; index < columns.length ; index++) {
            System.out.print(columns[index]);
            if(index != columns.length - 1) System.out.print(" ");
        }

        System.out.println();
        for (int i = 0; i < rows.length; i++) {
            System.out.print(rows[i] + " ");
            for (int j = 0; j < columns.length; j++) {
                System.out.print('S'); // or System.out.print(seats[i][j])
                if(j != columns.length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[] createArrWithOrderNumbers(int len) {
        int[] result = new int[len];
        for(int index = 0; index < len; index++) {
            result[index] = index + 1;
        }
        return result;
    }
/*
    public static void fillSeatsArr(char[][] arr) {
        for(char[] row: arr){
            Arrays.fill(row, 'S');
        }
    }
*/
}