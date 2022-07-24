package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    static char[][] seatsArr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows:\n> ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of seats in each row:\n> ");
        int seats = scanner.nextInt();

        System.out.println();
        seatsArr = initSeatsArr(rows, seats);
        printTheArrangement(seatsArr);
        System.out.println();

        System.out.print("Enter a row number:\n> ");
        int row = scanner.nextInt() - 1;
        System.out.print("Enter a seat number in that row:\n> ");
        int seat = scanner.nextInt() - 1;

        int price = Calculator.calculateCostForSeat(seatsArr, row, seat);
        System.out.printf("%nTicket price: $%s%n", price);
        printTheArrangement(seatsArr);
    }
    static void printTheArrangement(char[][] seats) {
        int rows = seats.length;
        int columns = seats[0].length;
        int[] rowsArr = createArrWithOrderNumbers(rows);
        int[] columnsArr = createArrWithOrderNumbers(columns);

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

    static char[][] initSeatsArr(int rows, int seats) {
        char[][] arr = new char[rows][seats];
        for(char[] row: arr){
            Arrays.fill(row, 'S');
        }
        return arr;
    }

}