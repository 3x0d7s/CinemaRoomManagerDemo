package cinema;

import java.util.Scanner;

class Input {
    static void setSeatsArr(Scanner scanner) {
        System.out.print("Enter the number of rows:\n> ");
        Cinema.rows = scanner.nextInt();
        System.out.print("Enter the number of seats in each row:\n> ");
        Cinema.seats = scanner.nextInt();
        Cinema.seatsArr = Cinema.initSeatsArr(Cinema.rows, Cinema.seats);
    }

    static void ticketServiceMenu(Scanner scanner) {
        while (true) {
            System.out.print("Enter a row number:\n> ");
            int row = scanner.nextInt() - 1;
            System.out.print("Enter a seat number in that row:\n> ");
            int seat = scanner.nextInt() - 1;

            System.out.println();
            if (row < 0 || seat < 0 || row >= Cinema.rows || seat >= Cinema.seats) {
                System.out.println("Wrong input!\n");
            } else if (Cinema.seatsArr[row][seat] == 'B') {
                System.out.println("That ticket has already been purchased!\n");
            } else {
                int price = Calculator.calculateCostForSeat(Cinema.seatsArr, row, seat);
                Cinema.currentIncome += price;
                Cinema.purchasedTickets++;
                System.out.printf("Ticket price: $%s%n", price);
                break;
            }
        }
    }

}
