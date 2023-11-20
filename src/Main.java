public class Main {
    public static void main(String[] args) {
        Product cpu = new CPU("Intel i9", 15);
        System.out.println(cpu.getName());
        System.out.println(cpu.getQuantity());
        cpu.setQuantity(10);
        System.out.println(cpu.getQuantity());
        Inventory inventory1 = Inventory.getInstance();
        inventory1.displayInventory();
        inventory1.changeQuantity("Intel i9", 8);
        inventory1.displayInventory();
        Inventory inventory2 = Inventory.getInstance();
        inventory2.displayInventory();
        inventory1.changeQuantity("Intel i9", 9);
        inventory2.displayInventory();
        //разные админы могут управлять одним складом
    }
}