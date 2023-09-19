import java.awt.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        //Main Dishes
        MainDish hamburger = new MainDish("Hamburger", "Bread, Meat, Cheese", "French Fries, Ketchup", 8);
        MainDish pizza = new MainDish("Pizza", "Cheese, Pepperoni, Tomato Sauce", "Extra ingredients", 18);
        MainDish chicken = new MainDish("Chicken", "Grilled", "Potato Mash, Salad", 15);
        MainDish bbq = new MainDish("BBQ Ribs", "Pork with BBQ sauce", "Onion Rings", 23);
        MainDish tacos = new MainDish("Tacos", "Pork, Avocado Sauce", "Pineapple, Parsley, Onion", 3);
        MainDish lasagna = new MainDish("Lasagna", "Pasta, Tomato Sauce, Cheese", "Bread with garlic butter", 25);
        MainDish fish = new MainDish("Fish", "Tilapia, Salmon", "Tartar sauce, Lemon", 30);

        //Drinks
        Drink lemonade = new Drink("Lemonade", 3);
        Drink soda = new Drink("Soda", 2);
        Drink coffee = new Drink("Coffee", 1);
        Drink orange = new Drink("Orange Juice", 4);

        //Desserts
        Dessert jelly = new Dessert("Jelly", "Strawberry", 2);
        Dessert flan = new Dessert("Flan", "Caramel Sauce", 3);
        Dessert cocktail = new Dessert("Fruit Cocktail", "Pineapple, Watermelon", 10);
        Dessert cake = new Dessert("Cheese Cake", "Blackberry Jelly", 5);

        //Display Menu-Main Dishes
        System.out.println("All Food Menu"+ "\n\t"+"---Main Dishes---");
        System.out.println(hamburger);
        System.out.println(pizza);
        System.out.println(chicken);
        System.out.println(bbq);
        System.out.println(tacos);
        System.out.println(lasagna);
        System.out.println(fish);

        //Display Menu-Drinks
        System.out.println("\n\t---Drinks---"+"\t");
        System.out.println(lemonade);
        System.out.println(soda);
        System.out.println(coffee);
        System.out.println(orange);

        //Display Menu-Desserts
        System.out.println("\n\t---Desserts---"+"\t");
        System.out.println(jelly);
        System.out.println(flan);
        System.out.println(cocktail);
        System.out.println(cake);

        //Display Menu-Combos
        System.out.println("\n\t---Combos with Special Discount---");

        Combo cm1 = new Combo(pizza, orange, cake);
        System.out.println(cm1);

        Combo cm2 = new Combo(chicken, soda, jelly);
        System.out.println(cm2);

        Combo cm3 = new Combo(bbq, coffee, cake);
        System.out.println(cm3);

        Combo cm4 = new Combo(tacos, soda, flan);
        System.out.println(cm4);

        Combo cm5 = new Combo(lasagna, orange, cocktail);
        System.out.println(cm5);



    }
}