import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number greater than 5:");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        DiagonalStar.printSquareStar(num);

        System.out.println("\nPress any key to exit:");
        scanner.nextLine();

    }
}
