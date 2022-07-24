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
        seatsArr = initSeatsArr(rows, seats);

        boolean isShouldBeStopped = true;
        while (isShouldBeStopped) {
            System.out.println();
            Output.printMenuItems();
            System.out.print("> ");
            int item = scanner.nextInt();
            switch (item) {
                case 0: {
                    isShouldBeStopped = false;
                    break;
                } case 1: {
                    System.out.println();
                    Output.printTheArrangement(seatsArr);
                    break;
                } case 2: {
                    System.out.println();
                    tickedServiceMenu(scanner);
                    break;
                }
            }

        }
        scanner.close();

    }

    static void tickedServiceMenu(Scanner scanner) {
        System.out.print("Enter a row number:\n> ");
        int row = scanner.nextInt() - 1;
        System.out.print("Enter a seat number in that row:\n> ");
        int seat = scanner.nextInt() - 1;
        int price = Calculator.calculateCostForSeat(seatsArr, row, seat);
        System.out.printf("Ticket price: $%s%n", price);
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