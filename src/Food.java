abstract class Food {
    protected String name;
    protected double price;
    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract String toString();

}
