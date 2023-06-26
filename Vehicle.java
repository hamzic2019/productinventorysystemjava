public class Vehicle extends Product {

    private String model;
    private int hp;

    Vehicle(String name, double price, String model, int hp) {
        super(name, price);
        this.model = model;
        this.hp = hp;
    }

    String getModel(){
        return model;
    }

    int getHp(){
        return hp;
    }


    public String toString(){
        return super.toString() + getModel() + "\n" + getHp() + "\n";
    }
    
}
