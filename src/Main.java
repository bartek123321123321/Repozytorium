import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwę swojej klasy");
        String name = scanner.nextLine();
        System.out.println("Podaj poziom klasy (np. 2, bo 2BT)");
        int level = scanner.nextInt();
        System.out.println("Witaj " + name + ". Za " + (5 - level) + " lata będę pisał maturę !");
        System.out.println("Po szkole pójde na studia");
    }
}
