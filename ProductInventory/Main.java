package ProductInventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id, name;
        double price;
        int quantity;

        System.out.println("Entet Product Id: ");
        id = sc.next();
        System.out.println("Entet Name: ");
        name = sc.next();
        System.out.println("Entet Price: ");
        price = sc.nextDouble();
        System.out.println("Entet Quantity: ");
        quantity = sc.nextInt();

        Product p1 = new Product(id, name, price, quantity);

        System.out.println(p1.toString());
    }
}
