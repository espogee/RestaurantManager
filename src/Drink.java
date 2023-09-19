public class Drink extends Food{
    public Drink(String name, double price) {
        super(name, price);
    }

    public String toString(){
        return "\n\t\t"+ this.name +"\n\t\t\t$"+this.price;
    };
}
