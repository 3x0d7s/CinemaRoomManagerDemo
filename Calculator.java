package cinema;

import java.util.Scanner;

class Calculator {
    static void calculateIncome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows:\n> ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of seats in each row:\n> ");
        int columns = scanner.nextInt();
        scanner.close();
        int result = calculateIncome(rows, columns);
        System.out.print("Total income:\n$" + result);
    }

    static int calculateIncome(int rows, int columns) {
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
