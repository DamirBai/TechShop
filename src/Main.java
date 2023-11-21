public class Main {
    public static void main(String[] args) {
        //singleton design pattern

        Inventory inventory1 = Inventory.getInstance();
        inventory1.displayInventory();
        inventory1.changeQuantity("Intel i9", 8);
        inventory1.displayInventory();
        Inventory inventory2 = Inventory.getInstance();
        inventory2.displayInventory();
        inventory1.changeQuantity("Intel i9", 9);
        inventory2.displayInventory();
        //разные админы могут управлять одним складом

        //decorator design pattern
        Product loyalCpu = new DiscountLoyalty(new CPU("Intel i9", 10, 1100), 15);

        // Добавляем скидку в праздничные дни к товару с скидкой лояльности
        Product loyalholiday = new DiscountHoliday(loyalCpu, 20);
        Product finalProduct = new DiscountBenefit(loyalholiday, 10);
        System.out.println(finalProduct.getName() + "\nЦена: " + finalProduct.getPrice());
    }
}