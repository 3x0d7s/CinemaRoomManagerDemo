package cinema;

class Output {
    static void printMenuItems() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    static void printStatistics() {
        Cinema.percentage = Calculator.calculatePercentage();
        System.out.println("Number of purchased tickets: " + Cinema.purchasedTickets);
        System.out.printf("Percentage: %.2f%c%n", Cinema.percentage, '%');
        System.out.println("Current income: $" + Cinema.currentIncome);
        System.out.println("Total income: $" + Cinema.totalIncome);
    }

    static void printTheArrangement(char[][] seats) {
        int rows = seats.length;
        int columns = seats[0].length;
        int[] rowsArr = Cinema.createArrWithOrderNumbers(rows);
        int[] columnsArr = Cinema.createArrWithOrderNumbers(columns);

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

}
