import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Pliki {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        if (file.exists()) {
            System.out.println("plik istnieje");
        } else {
            System.out.println("Plik nie istnieje");
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udalo sie utworzyc pliku");
            }
        }


        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine())
                System.out.println(scan.nextLine());

        } catch (FileNotFoundException e) {
            System.out.println("Nie ma pliku");
        }
    }
}
