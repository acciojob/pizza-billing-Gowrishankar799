/*package com.driver;

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
            bill+="Base Price Of The Pizza: "+this.price+"\n";
            if(isCheese)
                bill+="Extra Cheese Added: "+80+"\n";
            if(isToppings&&!isVeg) {
                bill += "Extra Toppings Added: " + 120 + "\n";
            }
            else{
                bill += "Extra Toppings Added: " + 70+ "\n";
            }
            if(isPaperbag)
                bill+="Paperbag Added: "+20+"\n";
            bill+="Total Price: "+total;
            isbill = true;

        }
        return this.bill;
    }
}*/
package com.driver;

public class Pizza {

    /*the price here will be printed on bill*/
    private int price;
    //all variable prices
    public int baseprice;
    public int ExtraCheeseprice;
    public int ExtraToppingsprice;
    public int papaerbagprice;

    private String bill;
    boolean ischeeseadded;
    boolean istoppingdadded;
    boolean istakeawayadded;
    boolean isgetbill;



    public Pizza(Boolean isVeg){
        // your code goes here
        this.ExtraCheeseprice=80;
        this.papaerbagprice=20;
        if(isVeg){
            this.baseprice=300;
            this.ExtraToppingsprice=70;
        }else{
            this.baseprice=400;
            this.ExtraToppingsprice=120;
        }
        this.price=baseprice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeeseadded){
            this.price=this.price+ExtraCheeseprice;
            ischeeseadded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingdadded){
            this.price=this.price+ExtraToppingsprice;
            istoppingdadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!istakeawayadded){
            this.price=this.price+papaerbagprice;
            istakeawayadded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isgetbill){
            this.bill="Base Price Of The Pizza: "+this.baseprice+"\n";
            if(ischeeseadded){
                this.bill=this.bill+"Extra Cheese Added: "+this.ExtraCheeseprice+"\n";
            }
            if(istoppingdadded){
                this.bill=this.bill+"Extra Toppings Added: "+this.ExtraToppingsprice+"\n";
            }
            if(istakeawayadded){
                this.bill=this.bill+"Paperbag Added: "+this.papaerbagprice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isgetbill=true;
        }
        return this.bill;

    }
}
