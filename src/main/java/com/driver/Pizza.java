package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean flag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            System.out.println(" Base Price Of The Pizza: "+this.price);
        }
        else{
            this.price = 400;
            System.out.println(" Base Price Of The Pizza: "+this.price);
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!flag) {
            System.out.println("Extra Cheese Added: 80");
            flag = true;
        }
        this.price+=80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            System.out.println("Extra Toppings Added: 70");
            this.price+=70;
        }
        else {
            System.out.println("Extra Toppings For Non-veg Pizza = 120");
            this.price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        System.out.println("Paperbag Added: 20");
        this.price+=20;
    }

    public String getBill(){
        // your code goes here
        int price1 = this.price;
        return "Total Price: "+ price1;
    }
}
