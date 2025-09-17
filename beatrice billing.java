package com;



	 
	
import java.util.Scanner;

public class billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number of items from cashier
        System.out.print("Enter number of different items: ");
        int numberOfItems = scanner.nextInt();
        
        // Arrays to store item details
        String[] itemNames = new String[numberOfItems];
        double[] prices = new double[numberOfItems];
        int[] quantities = new int[numberOfItems];
        double[] subtotals = new double[numberOfItems];
        
        double grandTotal = 0;
        
        // For loop to process each item
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("\n--- Item " + (i + 1) + " ---");
            
            // Clear the scanner buffer
            scanner.nextLine();
            
            // Get item details
            System.out.print("Enter item name: ");
            itemNames[i] = scanner.nextLine();
            
            System.out.print("Enter price per unit: ");
            prices[i] = scanner.nextDouble();
            
            System.out.print("Enter quantity: ");
            quantities[i] = scanner.nextInt();
            
            // Calculate subtotal for this item
            subtotals[i] = prices[i] * quantities[i];
            grandTotal += subtotals[i];
        }
        
        // Print receipt
        System.out.println("\n==================================================");
        System.out.println("             SUPERMARKET RECEIPT");
        System.out.println("==================================================");
        
        // Print item details
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(itemNames[i] + " " + quantities[i] + " x " + prices[i] + " = " + subtotals[i]);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Grand Total: " + grandTotal);
        
        // Apply discount if total > 50,000
        double discount = 0;
        double finalAmount = grandTotal;
        
        if (grandTotal > 50000) {
            discount = grandTotal * 0.05; // 5% discount
            finalAmount = grandTotal - discount;
            System.out.println("Discount (5%): " + discount);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Final Amount Payable: " + finalAmount);
        System.out.println("==================================================");
        System.out.println("         Thank you for shopping!");
        System.out.println("==================================================");
        
        scanner.close();
    }
}