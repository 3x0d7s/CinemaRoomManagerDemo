package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);
    static char[][] seatsArr;
    static int rows, seats;
    static int purchasedTickets = 0;
    static int totalIncome, currentIncome = 0;
    static double percentage;

    public static void main(String[] args) {
        Input.setSeatsArr(scanner);
        totalIncome = Calculator.calculateTotalIncome(rows, seats);

        boolean isShouldBeStopped = true;
        while (isShouldBeStopped) {
            System.out.println();
            Output.printMenuItems();
            System.out.print("> ");

            int item = scanner.nextInt();
            switch (item) {
                case 0 -> {
                    isShouldBeStopped = false;
                } case 1 -> {
                    System.out.println();
                    Output.printTheArrangement(seatsArr);
                } case 2 -> {
                    System.out.println();
                    Input.ticketServiceMenu(scanner);
                } case 3 -> {
                    System.out.println();
                    Output.printStatistics();
                } default -> {
                    System.out.println("\nWrong input!");
                }
            }

        }
        scanner.close();

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