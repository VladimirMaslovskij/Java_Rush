import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DecodeFile {
    private final ArrayList<Character> unencryptedFile = new ArrayList<>();
     ArrayList<Character> cesarDecoder(Scanner scanner, ArrayList<Character> encryptedDoc
            , ArrayList<Character> cyrillicTemplate) {
        int key = 0;
        try {
            System.out.print("Введите ключ :");
            key = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("""
                        ____________________
                        Некорректный ключ!
                        Введите число!
                        ____________________
                        """);
            scanner.nextLine();
        }
        unencryptedFile.clear();
        if(key >= 86 && key <=95){
            key += 155;
        }
        for (int i = 0; i < encryptedDoc.size(); i++) {
            for (int j = 0; j < cyrillicTemplate.size(); j++) {
                if (encryptedDoc.get(i).equals(cyrillicTemplate.get(j))) {
                    unencryptedFile.add(cyrillicTemplate.get(Math.abs(j-(key%94))));
                    continue;
                } else if (unencryptedFile.size() == i && j + 1 == cyrillicTemplate.size()) {
                    unencryptedFile.add(encryptedDoc.get(i));
                }
            }
        }
        System.out.println("<-----Расшифрованный_Файл----->");
        for (Character character:unencryptedFile){
            System.out.print(character);
        }
        System.out.println();
        System.out.println("<-----Расшифрованный_Файл----->");
        return unencryptedFile;
    }
}

