import java.util.ArrayList;
import java.util.Scanner;

public class Brain {
    private ArrayList<Product> productList;
    private Scanner scanner;

    Brain(){
        productList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    void getStarted(){
        
        loopiranje: while(true){
            System.out.println("\n");
            System.out.println("- - Inventory Application - -");
            System.out.println("1. Add New Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List All Products");
            System.out.println("4. Sort Products in range (a - b): ");
            System.out.println("5. Exit Application");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        

            switch(choice){
                case 1: {
                    addNewProduct();
                    break;
                }
                case 2: {
                    removeProduct();
                    break;
                }
                case 3: {
                    listAllProducts();
                    break;
                }
                case 4: {
                    listRangeProducts();
                    break;
                }
                case 5: {
                    System.out.println("Exiting application...");
                    break loopiranje;
                }
                default: {
                    System.out.println("Invalid Command!");
                    break;
                }
            }
        }
        
    }
    
    void listRangeProducts(){
        System.out.print("Enter start range: ");
        double startRange = scanner.nextDouble();

        System.out.print("Enter end range: ");
        double endRange = scanner.nextDouble();

        int attempts = 1;
        System.out.println();
        
        for(Product x: productList){
            if(x.getFullPrice() >= startRange && x.getFullPrice() <= endRange){
                System.out.println(attempts++ + ". " + x.getName() + " - $" + x.getPrice());
            }
            
        }


    }
    
    void listAllProducts(){
        int attempts = 1;
        // Product namme, Product Price, 
        System.out.println();
        for(Product x: productList){
            System.out.println(attempts++ + ". " + x.getName() + " - $" + x.getPrice());
        }

    }


    void removeProduct(){
        System.out.println("\n");
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        boolean removed = productList.removeIf(product -> product.getName().equalsIgnoreCase(name));
    
        if(removed){
            System.out.println("Product removed");
        }else {
            System.out.println("No product found!");
        }
    }


    void addNewProduct(){
        System.out.println("\n");
        System.out.println("= = = = =");
        System.out.println("Choose Product Type");
        System.out.println("1. Generic Product");
        System.out.println("2. Drink");
        System.out.println("3. Food");
        System.out.println("4. Vehicle");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character


        if(choice == 1){
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            
            Product product = new Product(name, price);

            productList.add(product);

            System.out.printf("Product %s added to Product List\n", name);

        }else if(choice == 2){
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter product volume (ml): ");
            int ml = scanner.nextInt();

            System.out.print("Enter Product Calories: ");
            int calories = scanner.nextInt();

            Drink drink = new Drink(name, price, ml, calories);

            productList.add(drink);

            System.out.printf("Product %s added to Product List\n", name);
        }else if(choice == 3){
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter product weight (g): ");
            int g = scanner.nextInt();

            System.out.print("Enter Product Calories: ");
            int calories = scanner.nextInt();

            Food food = new Food(name, price, g, calories);

            productList.add(food);
            System.out.printf("Product %s added to Product List\n", name);
        }else if(choice == 4){
            System.out.print("Enter Vehicle Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Vehicle Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter Vehicle model: ");
            String model = scanner.nextLine();

            System.out.print("Enter Vehicle horsepowers: ");
            int hp = scanner.nextInt();

            Vehicle vehicle = new Vehicle(name, price, model, hp);

            productList.add(vehicle);
            System.out.printf("Product %s added to Product List\n", name);
        }else {
            System.out.println("Invalid choice!");
            addNewProduct();
        }
        
    }
}
