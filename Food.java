public class Food extends Product{
    private int weight;
    private int calories;

    Food(String name, double price, int weight, int calories ) {
        super(name, price);
        this.weight = weight;
        this.calories = calories;
    }

    int getWeight(){
        return weight;
    }

    int getCalories(){
        return calories;
    }

    public String toString(){
        return super.toString() + getWeight() + "\n" + getCalories() + "\n";
    }
    
}
