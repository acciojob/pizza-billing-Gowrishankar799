package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheese;
    private boolean isToppings;
    private boolean isPaperbag;
    int total = 0;
    private boolean isbill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            total+=300;
        }
        else {
            this.price = 400;
            total+=400;
        }
        bill = "";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            this.isCheese = true;
            total+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isVeg) {
            if (!isToppings) {
                this.isToppings = true;
                total += 120;
            }
        }
        else if(!isToppings){
            this.isToppings = true;
            total+=70;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperbag){
            total+=20;
            this.isPaperbag = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isbill){
            bill+="Base Price Of The Pizza:"+this.price+"\n";
            if(isCheese)
                bill+="Extra Cheese Added:"+80+"\n";
            if(isToppings&&!isVeg) {
                bill += "Extra Toppings Added:" + 120 + "\n";
            }
            else{
                bill += "Extra Toppings Added:" + 70+ "\n";
            }
            if(isPaperbag)
                bill+="Paperbag Added:"+20+"\n";
            bill+="Total Price:"+total;
            isbill = true;

        }
        return this.bill;
    }
}
