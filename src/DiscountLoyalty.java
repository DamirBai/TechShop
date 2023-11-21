class DiscountLoyalty extends Discount {
    private final double discount;

    public DiscountLoyalty(Product product, double discount) {
        super(product);
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return (int) (super.getPrice() - (super.getPrice() * (discount/100)));
    }
}