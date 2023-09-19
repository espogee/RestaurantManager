public class Combo {
    //Combine Main Dish, Drink, Dessert
    private double comboPrice;
    MainDish dish;
    Drink drink;
    Dessert dessert;
    public Combo(MainDish dish, Drink drink, Dessert dessert) {
        this.dish = dish;
        this.drink = drink;
        this.dessert = dessert;
    }

    private double calculateComboPrice(){
        comboPrice = (dish.price + drink.price + dessert.price)-calculateComboDiscount();
        return comboPrice;
    }

    private double calculateComboDiscount(){
        double c = Math.random()*(6-0+1)+0;
        return c;
    }

    public String toString(){
        return "\n\t\t"+ dish.name + " + " + drink.name + " + " + dessert.name +"\n\t\t\t"+ "$"+ String.format("%.2f", calculateComboPrice());
    };
}
