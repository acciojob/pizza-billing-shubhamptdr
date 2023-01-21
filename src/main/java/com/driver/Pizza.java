package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    private int cheese;
    boolean isExtraCheese;
    boolean isExtraTopping;
    boolean isTakeaway;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isTakeaway = false;
        this.isBillGenerated = false;
        this.isExtraCheese = false;
        this.isExtraTopping = false;
        this.bill = "";

        if(this.isVeg){
            this.price = 300;
            this.topping = 70;
        }
        else {
            this.price = 400;
            this.topping = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheese){
            this.price += cheese;
            isExtraCheese = true;
        }

    }

    public void addExtraToppings(){
        if(!isExtraTopping){
            this.price += topping;
            isExtraTopping = true;
        }

    }

    public void addTakeaway(){
        if(!isTakeaway){
            this.price += 20;
            isTakeaway = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isExtraCheese){
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            }
            if(isExtraTopping){
                this.bill += "Extra Toppings Added: "+this.topping+"\n";
            }
            if(isTakeaway){
                this.bill += "Paperbag Added: "+"20"+"\n";
            }
            this.bill +="Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }

        return this.bill;
    }
}
