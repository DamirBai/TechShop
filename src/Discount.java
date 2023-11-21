abstract class Discount extends Product {
    protected Product product;

    public Discount(Product product) {
        super(product.getName(), product.getQuantity(), product.getPrice());
        this.product = product;
    }

    @Override
    public int getPrice() {
        return product.getPrice();
    }
}
