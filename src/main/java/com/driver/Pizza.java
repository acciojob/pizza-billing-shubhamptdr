package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int addExtraCheesePrice = 0;
    private int addExtraToppingsPrice = 0;
    private int addTakeawayPrice = 0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        this.bill =  "";
        this.bill += String.format("Base Price Of The Pizza: %d\n",this.price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.addExtraCheesePrice < 80){
            this.addExtraCheesePrice += 80;
            this.price += this.addExtraCheesePrice;
        }

    }

    public void addExtraToppings(){
        if(this.addExtraCheesePrice < 80){
            this.addExtraCheesePrice += 80;
            this.price += this.addExtraCheesePrice;
        }

        if(isVeg && this.addExtraToppingsPrice < 70){
            this.addExtraToppingsPrice += 70;
            this.price += this.addExtraToppingsPrice;
        }
        else if(this.addExtraToppingsPrice < 120) {
            this.addExtraToppingsPrice += 120;
            this.price += this.addExtraToppingsPrice;
        }

    }

    public void addTakeaway(){
        if(this.addTakeawayPrice == 0){
            this.addTakeawayPrice += 20;
        }
    }

    public String getBill(){

        if(this.addExtraCheesePrice != 0){
            this.bill += String.format("Extra Cheese Added: %d\n",addExtraCheesePrice);
        }
        if(this.addExtraToppingsPrice != 0){
            this.bill += String.format("Extra Toppings Added: %d\n",addExtraToppingsPrice);
        }
        if(this.addTakeawayPrice != 0){
            this.price += addTakeawayPrice;
            this.bill += String.format("Paperbag Added: %d\n",addTakeawayPrice);
        }
        this.bill += String.format("Total Price: %d\n",this.price);
        return this.bill;
    }
}
