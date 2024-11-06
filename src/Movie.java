import java.util.Scanner;

public class Movie extends Product{
    private String director;

    public Movie(String name, double price,String director) {
        super(name, price);
        this.director=director;
    }

    public Movie() {
    }

    @Override
    public double getDiscount() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how much will be discount");
        double discount_presentage=scanner.nextDouble();
        double the_discount=getPrice()*(discount_presentage/100);
        return getPrice()-the_discount;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
