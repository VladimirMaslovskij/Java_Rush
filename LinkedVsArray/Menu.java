import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Integer size;
    public int menu() {
        try
        {
            System.out.print("Input size of testing array : ");
            size = scanner.nextInt();
            if(size <= Integer.MIN_VALUE || size >= Integer.MAX_VALUE )
            {
                System.out.println("Too much for compare");
                menu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input number");
            scanner.nextLine();
             menu();
        }
        return size;
    }
}

