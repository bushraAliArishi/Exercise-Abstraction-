public class Book extends Product{
    private String auther;

    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther = auther;
    }

     public Book() {
        this.auther = auther;
    }

    @Override
    public double getDiscount() {
        double the_discount=getPrice()*0.3;

        return getPrice()-the_discount;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

}
