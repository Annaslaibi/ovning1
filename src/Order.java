import java.util.ArrayList;
import java.util.List;

public class Order {
    private static long counter;
    private long orderNumber;
    private List<Item> items;
    //private List<Item> items = new ArrayList<>();

    public Order (Item... items){
        this.items = new ArrayList<>();
        for (Item item : items){
            this.items.add(item);
        }
    }
    public String getReceipt(){
        String receipt = "Receipt for order #" + orderNumber + "\n----------\n";
        for (Item item : items)
            receipt += item + "\n";
        receipt += "Total excl. VAT: " + getTotalValue() + "\n";
        receipt += "Total incl. VAT: " + getTotalValuePlusVAT() + "\n";
        return receipt;
    }
    public double getTotalValuePlusVAT(){
        double summa = 0;
        for (Item item : items) {
            summa += item.getPriceWithVAT();
        }
        return summa;
    }
    public double getTotalValue(){
        double summa = 0;
        for (Item item : items) {
            summa += item.getPrice();
        }
        return summa;
    }
}