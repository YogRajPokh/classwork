import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Momo     Rs 100");
        System.out.println("2. Burger   Rs 150");
        System.out.println("3. Coffee   Rs 50");

        int totalAmount = 0;

        System.out.print("Enter the number of items: ");
        int numberOfOrders = scanner.nextInt();

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.print("Enter the food you want to order (1/2/3): ");
            int selectItem = scanner.nextInt();

            System.out.print("Enter the quantity you want to order: ");
            int selectQuantity = scanner.nextInt();

            int itemPrice = 0;

            switch (selectItem) {
                case 1:
                    itemPrice = 100;
                    break;
                case 2:
                    itemPrice = 150;
                    break;
                case 3:
                    itemPrice = 50;
                    break;
            }

            totalAmount += (itemPrice * selectQuantity);
        }

        double afterDiscount = totalAmount - (0.1 * totalAmount);
        double total = afterDiscount + (0.13 * afterDiscount);

        System.out.println("Your order total is Rs " + totalAmount);
        System.out.println("After a 10% discount: Rs " + afterDiscount);
        System.out.println("Total with 13% tax: Rs " + total);
    }
}
