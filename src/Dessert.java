public class Dessert extends Food{
    private String description;
    public Dessert(String name, String description, double price) {
        super(name, price);
        this.description = description;
    }

    public String toString(){
        return "\n\t\t"+ this.name+ "\n\t\t\t"+ this.description+ "\n\t\t\t$"+ this.price;
    };
}
