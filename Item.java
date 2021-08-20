package com.company;

public class Item
    {
        ////////////////////////////////////ITEM CLASS/////////////////////////////////
        private double cost;
        private String productName;
        private String description;
        private int howManyInBasket;
        private boolean onSale = false;
        private double percentageOfSale = 0.5;

        public Item(double price, String name, String info, int amount, boolean isOnSale, double whatSale) {
            cost = price;
            productName = name;
            description = info;
            howManyInBasket = amount;
            onSale = isOnSale;
            percentageOfSale = whatSale;
        }

        ////////////////////SETTERS AND GETTERS//////////////////////////

        public void setAmount(int amount)
        {
            this.howManyInBasket = amount;
        }

        public int getAmount()
        {
            return this.howManyInBasket;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getHowManyInBasket() {
            return howManyInBasket;
        }

        public void setHowManyInBasket(int howManyInBasket) {
            this.howManyInBasket = howManyInBasket;
        }

        public boolean isOnSale() {
            return onSale;
        }

        public void setOnSale(boolean onSale) {
            this.onSale = onSale;
        }

        public double getPercentageOfSale() {
            return percentageOfSale;
        }

        public void setPercentageOfSale(double percentageOfSale) {
            this.percentageOfSale = percentageOfSale;
        }
    }

