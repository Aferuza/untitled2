import java.util.Scanner;

public class JavaClasses {

    public static void main(String[] args) {
// interface between user and progr for user input

        Scanner fetchResultscaner = new Scanner(System.in);
        System.out.println("Whats Your name?");
        String name = fetchResultscaner.next();

        System.out.println("Whts yr age?");
        int age = fetchResultscaner.nextInt();

        System.out.println("Whts your quote?");
        String quote = fetchResultscaner.next();
        System.out.println(quote);
    }
}
