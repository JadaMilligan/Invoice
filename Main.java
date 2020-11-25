package com.company;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            ArrayList<String> products = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
                products.add("Bison Sweater");
                prices.add(55.99);
                products.add("Bison Tee");
                prices.add(14.99);
                products.add("Bison Hoodie");
                prices.add(23.99);
                products.add("Bison Decal"); //i changed it to decal because bumper sticker was a lot to type
                prices.add(4.99);

            Scanner customer = new Scanner(System.in);
            String customerSelection;
            ArrayList<String> purchases = new ArrayList<>();
            ArrayList<Double> costs=new ArrayList<>();
            System.out.println("How may I help you?");

            do {
                System.out.println("Enter: ");
                System.out.println("'1' to add purchase");
                System.out.println("'2' to change purchase");
                System.out.println("'3' to show purchases");
                System.out.println("'4' to finish transaction");
                customerSelection = customer.nextLine();

                if (customerSelection.equals("1")) {
                    System.out.println("What item would you like to buy?");
                    System.out.println("Bison Sweater for $55.99");
                    System.out.println("Bison Tee for $14.99");
                    System.out.println("Bison Hoodie for $23.99");
                    System.out.println("Bison Decal for $4.99");
                    String productAdded = customer.nextLine();

                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).equals(productAdded)) {
                            costs.add(prices.get(i));
                            purchases.add(productAdded);
                        }
                    }
                    System.out.println("How would you like to proceed?");
                }
                if (customerSelection.equals("2")) {
                    System.out.println("Your cart:");
                    for (int i = 0; i < costs.size(); i++) {
                        System.out.println(purchases.get(i) + " for $"+ costs.get(i));
                    }
                    System.out.println("What item do you want to remove?");
                    String product = customer.nextLine();
                    for (int i = 0; i < purchases.size(); i++) {
                        if (purchases.get(i).equals(product)) {
                            purchases.remove(i);
                            costs.remove(i);
                        }
                    }
                    System.out.println("How would you like to proceed?");
                }
                if (customerSelection.equals("3")) {
                    System.out.println("Your cart:");
                    for (int i = 0; i < costs.size(); i++) {
                        System.out.println(purchases.get(i) + " for $"+ costs.get(i));
                    }
                }
                System.out.println("How would you like to proceed?");
            } while (! customerSelection.equals("4"));
            double totalcost = 0.0;
            for (int i = 0; i < costs.size(); i++) {
                double product = costs.get(i);
                totalcost += product;
            }
            System.out.println("Your total is: $" + totalcost);
            System.out.println("Thank you for ordering and have a great day!");
        }
    }
