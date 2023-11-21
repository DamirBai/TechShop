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

        //скидка в праздничные дни со скидкой лояльности
        Product loyalholiday = new DiscountHoliday(loyalCpu, 20);
        Product finalProduct = new DiscountBenefit(loyalholiday, 10);
        System.out.println(finalProduct.getName() + "\nЦена: " + finalProduct.getPrice());

        //strategy design pattern
        Product cpu = new CPU("Intel i3", 12, 500);
        int cost = cpu.getPrice();
        Order order = new Order();
        order.setDelivery(new DeliveryStandard(cpu.getPrice())); //стандартная доставка
        cost = order.performDelivery();
        System.out.println("Доставка обошлась в " + cost + " долларов");
        order.setDelivery(new DeliveryExpress(cpu.getPrice())); //экспресс доставка
        cost = order.performDelivery();
        System.out.println("Доставка обошлась в " + cost + " долларов");
        order.setDelivery(new DeliveryPickup(cpu.getPrice())); //самовывоз
        cost = order.performDelivery();
        System.out.println("Доставка обошлась в " + cost + " долларов");
    }
}