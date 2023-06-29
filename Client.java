import java.text.DecimalFormat;

public class Client {
    private String name;
    private String last;
    private int age;
    private double amount;
    private DecimalFormat df = new DecimalFormat("#,##0.00");

    public Client(String name, String last, int age, double amount) {
        this.name = name;
        this.last = last;
        this.age = age;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }
    public String getLast(){
        return last;
    }
    public int getAge(){
        return age;
    }
    public double getAmount(){
        return amount;
    }
    public String getFullAmount(){
        return "$" + df.format(getAmount());
    }



}
