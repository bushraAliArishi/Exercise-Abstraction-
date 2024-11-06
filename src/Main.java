import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println("                         Movable class test");
        System.out.println("====================================================================");
        System.out.println();
        boolean moving=true;
        while (moving){
        System.out.print("Enter x position: ");
        int x = scanner.nextInt();
        System.out.print("Enter y position: ");
        int y = scanner.nextInt();
        System.out.print("Enter x speed: ");
        int xSpeed = scanner.nextInt();
        System.out.print("Enter y speed: ");
        int ySpeed = scanner.nextInt();

        MovabelrPrint movable = new MovabelrPrint(x, y, xSpeed, ySpeed);

        System.out.println("position: " + movable);
        System.out.println("choose movement \n1.up\n2.down\n3.left\n4.right\n5.quit: ");
        int direction = scanner.nextInt();

        switch (direction) {
            case 1:
                movable.moveUp();
                break;
            case 2:
                movable.moveDown();
                break;
            case 3:
                movable.moveLeft();
                break;
            case 4:
                movable.moveRight();
                break;
            case 5:
                System.out.println("Exiting");
                moving=false;
                break;
            default:
                System.out.println("Invalid choose from 1-5");
                break;
        }

        System.out.println("After moving : " + movable);
        }
        System.out.println("====================================================================");
        System.out.println("                         Book class test");
        System.out.println("====================================================================");

        System.out.print("Enter book name: ");
        String book_Name = scanner.next();
        System.out.print("Enter book price: ");
        double bookPrice = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        Book book = new Book(book_Name, bookPrice, author);
        System.out.println("Book Details:");
        System.out.println("Name: " + book.getName());
        System.out.println("Author: " + book.getAuther());
        System.out.println("Original Price: " + book.getPrice());
        System.out.println("Discounted Price: " + book.getDiscount());
        System.out.println("====================================================================");
        System.out.println("                         Movie class test");
        System.out.println("====================================================================");

        System.out.print("\nEnter movie name: ");
        String movieName = scanner.next();
        System.out.print("Enter movie price: ");
        double moviePrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter director name: ");
        String director = scanner.next();

        Movie movie = new Movie(movieName, moviePrice, director);
        double movieDis=movie.getDiscount();

        System.out.println("Movie Details:");
        System.out.println("Name: " + movie.getName());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Original Price: " + movie.getPrice());
        System.out.println("Discounted Price: " + movieDis);







    }





    }

