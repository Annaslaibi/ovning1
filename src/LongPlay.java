public class LongPlay extends Recording{
    private static final int CURRENT_YEAR = 2025;
    public LongPlay (String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);

    }
    public String getType(){
        return "LP";
    }
    public double getPrice(){


        return super.getPrice() + (CURRENT_YEAR - getYear()) * 5;
    }
}