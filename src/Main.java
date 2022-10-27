import java.io .*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        getWordCount("C:\\Users\\User\\IdeaProjects\\statistictext\\src\\input.txt");
    }
    public static void getWordCount(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner (file);


        String wording = "";
        while (scanner.hasNextLine()) {
            wording = scanner.nextLine();
        }
        System.out.println("Всего слов: " + wording.split(" ").length);
        System.out.println("Всего символов: " + wording.length());
        System.out.println("Всего символов без пробела: " + wording.replaceAll(" ", "").length());
    }
}




