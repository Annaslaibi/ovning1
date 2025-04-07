public class Book extends Item implements PriceableWithVAT6 {

    private static final double BOUND_BONUS = 0.3;
    private double price;
    private boolean bound;
    private String author;
    public Book (String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }
    public double getPrice() {
        double priceWithBonus = bound ? price * (1 + BOUND_BONUS) : price;
        return priceWithBonus;

    }


    @Override
    public String toString() {
        return " Book { name='" + getName() + "', author='" + author + "', " + ", bound=" + bound + ", price="
                + getPrice() + ", price+vat=" + getPriceWithVAT();

    }
}
