package cinema;

import java.util.Scanner;

class Calculator {

    static double calculatePercentage() {
        return 100.0 * Cinema.purchasedTickets / (Cinema.rows * Cinema.seats);
    }

    static int calculateTotalIncome(int rows, int columns) {
        if (rows * columns <= 60) {
            return rows * columns * 10;
        } else {
            int frontRows = rows / 2;
            int sumFromTheFront = frontRows * columns * 10;
            int sumFromTheBack = (rows - frontRows) * columns * 8;
            return sumFromTheFront + sumFromTheBack;
        }
    }

    static int calculateCostForSeat(char[][] seatsArr ,int row, int seat) {
        seatsArr[row][seat] = 'B';
        if (seatsArr.length * seatsArr[0].length <= 60) {
            return 10;
        } else if (row < seatsArr.length / 2 ) {
            return 10;
        } else {
            return 8;
        }
    }

}
