import java.util.ArrayList;
import java.util.List;
public class Inventory {
    private static Inventory instance;
    private List<Product> inventory;

    private Inventory() { //приватный конструктор
        this.inventory = new ArrayList<>();
        inventory.add(new CPU("Intel i9", 10, 1100));
        inventory.add(new CPU("Intel i7", 2, 1000));
        inventory.add(new CPU("Intel i5", 7, 850));
    }

    public static Inventory getInstance() { //дефолт имплементация синглтона
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public void displayInventory() { //проверка склада
        System.out.println("Current Inventory:");
        for (Product product : inventory) {
            System.out.println(product.getName() + ": " + product.getQuantity() + ", " + product.getPrice() + " dollars");
        }
    }

    private Product findProduct(String productName) { //возвращает продукт чисто для функции changeQuantity()
        for (Product product : inventory) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public void changeQuantity(String productName, int quantity) { //меняет колво
        Product product = findProduct(productName);
        if(product != null){
            product.setQuantity(quantity);
        }
    }
    public void changePrice(String productName, int price) { //меняет цену
        Product product = findProduct(productName);
        if(product != null){
            product.setPrice(price);
        }
    }
}
