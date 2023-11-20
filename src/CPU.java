public class CPU extends Product{
    private final String name;
    private int quantity;
    public CPU(String name, int quantity) {
        super(name, quantity);
        this.name = name;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
