import java.text.DecimalFormat;

public class Product {
    private String name;
    private double price;
    private DecimalFormat df = new DecimalFormat("#,##0.00");
    
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    String getName(){
        return name;
    }

    String getPrice(){
        return df.format(this.price);
    }

    double getFullPrice(){
        return price;
    }

    public String toString(){
        return getName() + "\n" + getPrice() + "\n";
    }
}
