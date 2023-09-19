import javax.xml.namespace.QName;

public class MainDish extends Food{
    private String mainmeal, accompaniments;
    public MainDish(String name, String mainmeal, String accompaniments, double price) {
        super(name, price);
        this.mainmeal = mainmeal;
        this.accompaniments = accompaniments;
    }

    public String toString(){
        return "\n\t\t"+ this.name +"\n\t\t\t"+ this.mainmeal +"\n\t\t\t"+ this.accompaniments + "\n\t\t\t$"+ this.price;
    };
}
