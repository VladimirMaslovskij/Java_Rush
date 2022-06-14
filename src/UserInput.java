import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    int userInput = -1;
    int userInput(Scanner scanner) {
            try {
                userInput = scanner.nextInt();
                if (userInput < 0 || userInput > 9) {
                    System.out.println("""
                            <-------------------->
                             Некорректный ввод!
                             Нет такого пункта меню!
                            <-------------------->
                            """);
                }
            } catch (InputMismatchException e) {
                System.out.println("""
                        <-------------------->
                        Некорректный ввод!
                        Введите число!
                        <-------------------->
                        """);
                scanner.nextLine();
            }
        return userInput;
    }
}
