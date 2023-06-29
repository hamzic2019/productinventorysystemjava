public class App {
    public static void main(String[] args){
        Client haris = new Client("Haris", "Hammzic", 26, 6543);
        Client amina = new Client("Amina","Suljovic", 25, 500);

        System.out.println(amina.getFullAmount());
    }
}