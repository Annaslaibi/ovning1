public abstract class Recording extends Item implements PriceableWithVAT25{

    private final String artist;
    private final int year;
    private final int condition;
    private final double price;
    protected Recording (String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }
    public String getArtist(){
        return artist;
    }
    public abstract String getType();
    public int getCondition(){
        return condition;
    }
    public double getPrice(){
        return Math.max(price * (condition / 10.0), 10);
    }

    public int getYear(){
        return year;
    }
    protected double getOriginalPrice(){
        return price;
    }
    @Override
    public String toString() {
        return getType() + " { name=" + getName() + ", artist='" + artist + "', year=" + year + ", condition=" + condition
                + ", original price=" + getOriginalPrice() + ", price=" + getPrice() + ", price+vat=" + getPriceWithVAT() + " }";
    }

}