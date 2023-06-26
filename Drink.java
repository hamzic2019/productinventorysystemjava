public class Drink extends Product {
    private int ml;
    private int calories;

    Drink(String name, double price, int ml, int calories) {
        super(name, price);
        this.ml = ml;
        this.calories = calories;
    }

    int getMl(){
        return ml;
    }
    int getCalories(){
        return calories;
    }

    public String toString(){
        return super.toString() + getMl() + "\n" + getCalories() + "\n";
    }
    
}
