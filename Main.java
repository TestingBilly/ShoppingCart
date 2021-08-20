package com.company;

import java.util.Scanner;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        ///////////////////////////////BASKET TOTALS////////////////////////////////
        Vector<Double> basketTotal = new Vector<>();
        Vector<String> basket = new Vector<>();

        ////////////HAMMER////////////////
        Item hammer = new Item(10, "Hammer", "Used to hit nails", 3, false, 0.8);

        Scanner hR = new Scanner(System.in);
        System.out.println("How Many Hammers do you want");
        hammer.setHowManyInBasket(hR.nextInt());



        double hammerTotal = (hammer.getCost() * hammer.getHowManyInBasket());
        int noOfHammers = 0;

        if (hammer.getHowManyInBasket() >= 1) {
            if (hammer.isOnSale()) {
                hammerTotal = hammerTotal * hammer.getPercentageOfSale();
            }
            basketTotal.add(hammerTotal);
            do {
                basket.add(hammer.getProductName());
                noOfHammers = noOfHammers + 1;
            }
            while (noOfHammers < hammer.getHowManyInBasket());
            System.out.println("You have added " + hammer.getHowManyInBasket() + " " + hammer.getProductName() + "s to basket. That will cost £" + hammerTotal);
        }

        if (hammer.isOnSale()) {
            System.out.println("This Item is on sale, you saved " + hammer.getPercentageOfSale() * 100 + "%.");
        }


        ////////////SCREWDRIVER/////////////
        Item screwdriver = new Item(10.00, "Screwdriver", "Used to screw screws", 2, true, 0.75);
        Scanner sR = new Scanner(System.in);
        System.out.println("How Many Screwdrivers do you want");
        screwdriver.setHowManyInBasket(sR.nextInt());

        double screwdriverTotal = (screwdriver.getCost() * screwdriver.getHowManyInBasket());
        int noOfScrewdrivers = 0;


        if (screwdriver.getHowManyInBasket() >= 1) {
            if (screwdriver.isOnSale()) {
                screwdriverTotal = screwdriverTotal * screwdriver.getPercentageOfSale();
            }
            basketTotal.add(screwdriverTotal);
                do {
                    basket.add(screwdriver.getProductName());
                    noOfScrewdrivers = noOfScrewdrivers + 1;
                }
                while (noOfScrewdrivers < screwdriver.getHowManyInBasket());
                System.out.println("You have added " + screwdriver.getHowManyInBasket() + " " + screwdriver.getProductName() + "s to basket. That will cost £" + screwdriverTotal);

                if (screwdriver.isOnSale()) {
                    System.out.println("This Item is on sale, you saved " + screwdriver.getPercentageOfSale() * 100 + "%");
                }
            }


            ////////////LAWNMOWER/////////////
            Item lawnmower = new Item(100.00, "Lawnmower", "you can cut grass with this", 1, false, 0.75);
            Scanner lR = new Scanner(System.in);
            System.out.println("How Many lawnmowers do you want");
            lawnmower.setHowManyInBasket(lR.nextInt());

            double lawnmowerTotal = (lawnmower.getCost() * lawnmower.getHowManyInBasket());
            int noOfLawnmowers = 0;


            if (lawnmower.getHowManyInBasket() >= 1) {
                if (lawnmower.isOnSale()) {
                    lawnmowerTotal = lawnmowerTotal * lawnmower.getPercentageOfSale();
                }
                basketTotal.add(lawnmowerTotal);
                do {
                    basket.add(lawnmower.getProductName());
                    noOfLawnmowers = noOfLawnmowers + 1;
                }
                while (noOfLawnmowers < lawnmower.getHowManyInBasket());
                System.out.println("You have added " + lawnmower.getHowManyInBasket() + " " + lawnmower.getProductName() + "s to basket. That will cost £" + lawnmowerTotal);
            }

            if (lawnmower.isOnSale()) {
                System.out.println("This Item is on sale, you saved " + lawnmower.getPercentageOfSale() * 100 + "%");
            }
        ////////////BILLY/////////////
        Item billy = new Item(6000.00, "Billy", "Ninja who could beat ash in a fight", 1, false, 0.75);
        Scanner bR = new Scanner(System.in);
        System.out.println("How Many Knights of a Micronation do you want");
        billy.setHowManyInBasket(bR.nextInt());

        double billyTotal = (billy.getCost() * billy.getHowManyInBasket());
        int noOfBillys = 0;


        if (billy.getHowManyInBasket() >= 1) {
            if (billy.isOnSale()) {
                billyTotal = billyTotal * billy.getPercentageOfSale();
            }
            basketTotal.add(billyTotal);
            do {
                basket.add(billy.getProductName());
                noOfBillys = noOfBillys + 1;
            }
            while (noOfBillys < billy.getHowManyInBasket());
            System.out.println("You have added " + billy.getHowManyInBasket() + " " + billy.getProductName() + "s to basket. That will cost £" + billyTotal);
        }

        if (billy.isOnSale()) {
            System.out.println("This Item is on sale, you saved " + billy.getPercentageOfSale() * 100 + "%");
        }

        ///////////////ADDING UP ALL THAT'S IN THE BASKET FOR TOTAL AMOUNT SPENT////////////////

        double totalSpent = 0;
        for (double value : basketTotal.toArray(new Double[0])) {
            totalSpent += value;
        }
        if (totalSpent==0)
        {
            System.out.println("You haven't purchased anything. We hope to see you again when you wish to!");
        }

            ////////////////////BASKET OUTPUT//////////////////////////
            System.out.println("In your Basket there is" + basket);
            System.out.println("That will cost £" + totalSpent);
        }

    }





